class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int []result = new int[nums.length];
        int index = nums.length - 1;
        int l,r;
        while(left <= right){
            l = nums[left] * nums[left];
            r = nums[right] * nums[right];
            if(r > l){
                result[index--] = r;
                right--;
            }
            else{
                result[index--] = l;
                left++;
            }
        }
        return result;
    }
}