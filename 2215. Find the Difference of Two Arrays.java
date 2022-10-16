class Solution {
    private boolean isPresent(int[] a, int n){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(a[mid] == n) return true;
            else if(a[mid] > n) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(i > 0 && nums1[i] == nums1[i - 1]) continue;
            if(!isPresent(nums2, nums1[i])) list1.add(nums1[i]);
        }
        for(int i = 0; i < n; i++){
            if(i > 0 && nums2[i] == nums2[i - 1]) continue;
            if(!isPresent(nums1, nums2[i])) list2.add(nums2[i]);
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}