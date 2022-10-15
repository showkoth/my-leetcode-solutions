class Solution {
    public String reverseWords(String s) {
        String result = "";
        String[] splitted = s.split("\\s");
        for(String str : splitted){
            String reversed = reverse(str);
            result = result + " " + reversed;
        }
        return result.trim();
    }
    
    private String reverse(String s){
        String newStr = "";
        for(int i = s.length() - 1; i >= 0; i--){
            var temp = s.charAt(i);
            newStr = newStr + temp;
        }
        return newStr;
    }
}