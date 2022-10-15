class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer> hmap = new HashMap<>();
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            hmap.put(nums[i], i);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                int s = nums[i] + nums[j];
                int c = 0 - s;
                int k = hmap.getOrDefault(c, -1);
                if(k != -1){
                    if(k == i || k == j) continue;
                    List<Integer> li = new ArrayList();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(c);
                    Collections.sort(li);
                    result.add(li);
                }
            }
        }
        return new ArrayList<>(result);
    }
}