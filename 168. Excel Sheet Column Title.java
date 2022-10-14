class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber != 0){
            int rem = (columnNumber - 1) % 26;
            char ch = (char) ('A' + rem);
            res += ch;
            columnNumber = (columnNumber - 1) / 26;
        }
        return new StringBuilder(res).reverse().toString();
    }
}