class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int index = hmap.getOrDefault(nums[i], -1);
            if(index >= 0 && Math.abs(i - index) <= k){
                return true;
            }
            hmap.put(nums[i], i);
        }
        return false;
    }
}