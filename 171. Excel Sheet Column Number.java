class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int pos = 1;
        int sum = 0;
        for(int i = len - 1; i >= 0; i--){
            int x = columnTitle.charAt(i) - 64;
            sum += pos * x;
            pos *= 26;   
        }
        return sum;
    }
}