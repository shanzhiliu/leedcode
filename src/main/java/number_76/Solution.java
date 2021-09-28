package number_76;


import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.LinkedList;

//超时
class Solution {
    public String minWindow(String s, String t) {

        String resultStr = "";
        if(s.length() < 1 || t.length() < 1) return resultStr;

        LinkedList<Character> slider = new LinkedList<>();


        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            slider.add(c);

            while (coverStr(slider,t)) {

                if(resultStr.equals("")) {
                    resultStr = getSliderStr(slider);
                }
                else {
                    String sliderStr = getSliderStr(slider);
                    if(resultStr.length() > sliderStr.length()) {
                        resultStr = sliderStr;
                    }
                }
                slider.poll();
            }
        }

        return resultStr;
    }

    private boolean coverStr(LinkedList<Character> slider, String t) {

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if(map.containsKey(c)) {
                Integer value = map.get(c);
                map.put(c,value + 1);
            }
            else
            {
                map.put(c,1);
            }
        }

        for (Character c : slider) {
            if(map.containsKey(c)) {
                Integer value = map.get(c);

                if(value == 1) {
                    map.remove(c);
                }
                else {
                    map.put(c,value - 1);
                }
            }
        }

        if(map.size() == 0) return true;

        return false;
    }

    private String getSliderStr(LinkedList<Character> slider) {
        StringBuilder builder = new StringBuilder("");

        for (int i = 0; i < slider.size(); i++) {
            builder.append(slider.get(i));
        }
        return builder.toString();
    }
}