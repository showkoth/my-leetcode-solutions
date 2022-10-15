class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hmap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            int count = hmap.getOrDefault(nums1[i], 0);
            hmap.put(nums1[i], ++count);
        }
        for(int i = 0; i < nums2.length; i++){
            if(hmap.getOrDefault(nums2[i], 0) > 0){
                result.add(nums2[i]);
                hmap.put(nums2[i], hmap.get(nums2[i]) - 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}