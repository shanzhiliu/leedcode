package number_763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution1 {
    public List<Integer> partitionLabels(String s) {

        List<Integer> result = new ArrayList();
        if(s.length() < 1) return  result;

        HashMap<Character,Integer> hashMap = new HashMap<>();

        //遍历一遍,得到一个字母出现的最大位置
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            hashMap.put(c,i);
        }

        Integer count = 0;
        Integer rangeMax = 0;

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer cuMax = hashMap.get(c);
            rangeMax  = Math.max(cuMax,rangeMax);

            count ++;
            if(i == rangeMax){
                result.add(count);
                rangeMax = 0;
                count = 0;
            }
        }
        return result;
    }

}