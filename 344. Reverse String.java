class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0);
    }
    
    private void reverse(char[] s, int i){
        if(i == s.length / 2) return;
        var temp = s[i];
        s[i] = s[s.length - 1 - i];
        s[s.length - 1 - i] = temp;
        reverse(s, i + 1);
    }
}