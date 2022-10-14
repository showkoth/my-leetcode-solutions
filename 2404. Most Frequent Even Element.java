class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int MAX = Integer.MIN_VALUE;
        int MAX_KEY = -1;
        for(int num : nums){
            if(num % 2 != 0) continue;
            int val = hmap.getOrDefault(num, 0);
            val++;
            if((val > MAX) || (val == MAX && num < MAX_KEY)) {
                MAX = val;
                MAX_KEY = num;
            }
            hmap.put(num, val);
        }
        return MAX_KEY;
    }
}