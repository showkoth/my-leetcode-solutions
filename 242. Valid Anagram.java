class Solution {
    
    private String sort(String str){
        char array[] = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    public boolean isAnagram(String s, String t) {
        if(sort(s).equals(sort(t))) return true;
        return false;
    }
}