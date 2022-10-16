class Solution {
    private boolean doesIntersect(int[] a, int k){
        int low = 0; 
        int high = a.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(a[mid] == k) return true;
            else if(a[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        for(int i = 0; i < m; i++){
            if(i > 0 && nums1[i] == nums1[i - 1]) continue;
            if(doesIntersect(nums2, nums1[i])) al.add(nums1[i]);
        }
        // Integer[] res = new Integer[al.size()];
        // res = al.toArray(res);
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}