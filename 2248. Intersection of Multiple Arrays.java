class Solution {
    Map<Integer, Integer> hmap = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    public List<Integer> intersection(int[][] nums) {
        int rows = nums.length;
        for(int i = 0; i < rows; i++){
            int cols = nums[i].length;
            for(int j = 0; j < cols; j++){
                int val = nums[i][j];
                int freq = hmap.getOrDefault(val, 0);
                hmap.put(val, ++freq);
            }
        }
        for(int i = 1; i <= 1000; i++){
            int freq = hmap.getOrDefault(i, 0);
            if(freq == rows) result.add(i);
        }
        return result;
    }
}