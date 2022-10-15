class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> hmap = new HashMap<>();
        
        for(int num : nums){
            if(hmap.getOrDefault(num, false)) return true;
            hmap.put(num, true);
        }
        return false;
    }
}