package day3;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] new_nums = new int[2];
        int len = nums.length;

        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if((nums[i] + nums[j]) == target){
                    new_nums[0] = i;
                    new_nums[1] = j;
                }
            }

        }
        return new_nums;
    }
}
