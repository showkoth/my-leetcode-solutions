class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rev = rev(x);
        return rev == x;
    } 
    
    private int rev(int number){
        int res = 0;
        int rem;
        while(number != 0){
            rem = number % 10;
            res = res * 10 + rem;
            number = number / 10;
        }
        return res;
    }
}