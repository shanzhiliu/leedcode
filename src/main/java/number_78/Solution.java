package number_78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();

        generate(0,nums.length,nums,new ArrayList<>(),lists);
        return lists;
    }

    private void generate(int index, int max, int[] nums,List<Integer>  itemList ,List<List<Integer>> lists) {

        if(index == max) {
            lists.add(new ArrayList<>(itemList));
            return;
        }

        generate(index + 1,max,nums,itemList,lists);
        itemList.add(nums[index]);
        generate(index + 1,max,nums,itemList,lists);
        itemList.remove(itemList.size() -1);
    }

}