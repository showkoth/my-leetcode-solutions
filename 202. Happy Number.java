class Solution {
    private int squaredSum(int n){
        int sum = 0;
        while(n != 0){
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Map<Integer, Boolean> hmap = new HashMap<>();
        while(true){
            n = squaredSum(n);
            if(n == 1) return true;
            if(hmap.containsKey(n)) return false;
            hmap.put(n,true);
        }
    }
}