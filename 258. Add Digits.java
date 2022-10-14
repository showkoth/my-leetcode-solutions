class Solution {
    private int digitSum(int n){
        int sum = 0;
        while(n != 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(true){
            num = digitSum(num);
            if(num / 10 == 0) return num;
        }
    }
}