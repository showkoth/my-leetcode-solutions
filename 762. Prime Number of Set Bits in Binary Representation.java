class Solution {
    private boolean isPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            int set_bits = Integer.bitCount(i);
            if(isPrime(set_bits)) count++;
        }
        return count;
    }
}