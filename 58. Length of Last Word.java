class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        boolean found = false;
        for(int i = len - 1; i >= 0; i--){
            if(found == true && s.charAt(i) == ' '){
                return count;
            }
            if(s.charAt(i) != ' ' && found == false){
                found = true;
            }
            if(found == true) count++;
        }
        return count;
    }
}