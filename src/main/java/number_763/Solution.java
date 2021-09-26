package number_763;

import com.sun.org.apache.regexp.internal.REUtil;
import sun.jvmstat.perfdata.monitor.PerfStringConstantMonitor;

import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> result = new ArrayList();

        if(s.length() < 1) return  result;

        if(s.length() == 1){
            result.add(1);
            return  result;
        }

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> abacbd = solution.partitionLabels("ababcbacadefegdehijhklij");
        abacbd.stream().forEach(s -> System.out.println(s));
    }

}