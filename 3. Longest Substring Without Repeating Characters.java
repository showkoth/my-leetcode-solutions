class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        if(s.length() == 0) return 0;
        for(int i = 0; i < s.length(); i++){
            Map<Character, Boolean> hmap = new HashMap<>();
            int count = 0;
            for(int j = i; j < s.length(); j++){
                if(hmap.getOrDefault(s.charAt(j), false)){
                    break;
                }
                count++;
                if(count > max){
                    max = count;
                }
                hmap.put(s.charAt(j), true);
            }
        }
        return max;
    }
}