class Solution {
    private int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = lowLimit; i <= highLimit; i++){
            int s = digitSum(i);
            int val = hmap.getOrDefault(s, 0);
            ++val;
            if(val > max) max = val;
            hmap.put(s,val);
        }
        return max;
    }
}