class Solution {
    private int countWords(String s){
        s = s.trim();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') count++;
        }
        return count + 1;
    }
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String sentence : sentences){
            int count = countWords(sentence);
            if(count > max) max = count;
        }
        return max;
    }
}