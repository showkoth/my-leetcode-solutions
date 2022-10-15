class Solution {
    
    private boolean isAlphaNumeric(char ch){
        if(ch >= 'a' && ch <= 'z') return true;
        else if(ch >= '0' && ch <= '9') return true;
        else return false;
    }
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        System.out.println(s);
        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!isAlphaNumeric(l)){
                left++;
                continue;
            }
            if(!isAlphaNumeric(r)){
                right--;
                continue;
            }
            if(l != r) return false;
            left++;
            right--;
        }
        return true;
    }
}