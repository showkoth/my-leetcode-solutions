class Solution {
    private boolean isCommonPrefix(String[] strs, char ch, int index){
        for(String s : strs){
            if(index > s.length() - 1) return false;
            if(s.charAt(index) != ch) return false;
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String s = strs[0];
        for(int i = 0; i < s.length(); i++){
            if(isCommonPrefix(strs, s.charAt(i), i)) res += s.charAt(i);
            else return res;
        }
        return res;
    }
}