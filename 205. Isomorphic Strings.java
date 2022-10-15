class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hmap1 = new HashMap<>();
        Map<Character, Character> hmap2 = new HashMap<>();
        int len_s = s.length();
        int len_t = t.length();
        if(len_s != len_t) return false;
        for(int i = 0; i < len_s; i++){
            char c1 = hmap1.getOrDefault(s.charAt(i), '0');
            if(c1 != '0' && c1 != t.charAt(i)) return false;
            char c2 = hmap2.getOrDefault(t.charAt(i), '0');
            if(c2 != '0' && c2 != s.charAt(i)) return false;
            hmap1.put(s.charAt(i), t.charAt(i));
            hmap2.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}