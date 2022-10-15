class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int nonZeroIndex = 0;
        int temp;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                temp = nums[nonZeroIndex];
                nums[nonZeroIndex++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}