class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, count = 0;
        int right = 0;
        while(right < nums.length){
            if(val == nums[right]){
                right++;
            }
            else{
                nums[left++] = nums[right++];
                count++;
            }
        }
        return count;
    }
}