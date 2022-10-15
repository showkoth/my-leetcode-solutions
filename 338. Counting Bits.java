class Solution {
    int bitCount(int n){
        return Integer.bitCount(n);
    }
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i <= n; i++){
            res[i] = bitCount(i);
        }
        return res;
    }
}