class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            count[c - 'a'] += 1;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            count[c - 'a'] -= 1;
        }
        for(int c : count){
            if(c < 0) return false;
        }
        return true;
        
    }
}