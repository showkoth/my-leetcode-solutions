class Solution {
    private boolean isFrequencyEqual(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(Character c : s1.toCharArray()){
            freq[c - 'a'] += 1;
        }
        
        for(int i = 0; i < s2.length() - s1.length() + 1; i++){
            int[] freq2 = new int[26];
            String sub = s2.substring(i,i + s1.length());
            for(Character c : sub.toCharArray()){
                freq2[c - 'a'] += 1;
            }
            if(isFrequencyEqual(freq, freq2)) return true;
        }
        return false;
    }
}