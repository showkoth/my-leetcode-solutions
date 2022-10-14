class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            int val = hmap.getOrDefault(num, 0);
            hmap.put(num, ++val);
            if(val > n / 2) return num;
        }
        return -1;
    }
}