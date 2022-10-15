class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, count = 1;
        int right = 1;
        int curr = nums[0];
        while(right < nums.length){
            if(curr == nums[right]){
                right++;
            }
            else{
                curr = nums[right];
                right++;
                nums[++left] = curr;
                count++;
            }
        }
        return count;
    }
}