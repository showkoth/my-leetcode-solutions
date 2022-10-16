class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Map<List<Integer>, Integer> hmap = new HashMap<>();
        for(int i = 0; i < n - 3; i++){
            for(int j = i + 1; j < n - 2; j++){
                // if(nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
                long res = (nums[i] + nums[j]);
                // System.out.println(res);
                long remSum = target - res;
                // System.out.println(remSum);
                while(left < right){
                    long twoSum = nums[left] + nums[right];
                    if(twoSum > remSum) right--;
                    else if(twoSum < remSum) left++;
                    else{
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[left]);
                        li.add(nums[right]);
                        int count = hmap.getOrDefault(li, 0);
                        if(count == 0){
                            result.add(li);
                            hmap.put(li,++count);
                        }
                        left++;
                    }
                }
            }
        }
        return result;
    }
}