class Solution {

    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for(int i = 0; i < 32; i++){
            int count_ones = 0;
            for(int j = 0; j < len; j++){
                count_ones += (nums[j]>>i) & 1;
            }
            int count_zeros = len - count_ones;
            sum += count_ones * count_zeros;
        }
        return sum;
    }
}