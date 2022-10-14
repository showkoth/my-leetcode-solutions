class Solution {
    public String addStrings(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int len_1 = num1.length();
        int len_2 = num2.length();
        int sz = Math.max(len_1, len_2);
        String result = "";
        int carry = 0;
        for(int i = 0; i < sz; i++){
            int x = (i >= len_1) ? 0 : num1.charAt(i) - '0';
            int y = (i >= len_2) ? 0 : num2.charAt(i) - '0';
            int sum = x + y + carry;
            result += sum % 10;
            carry = sum / 10;
        }
        if(carry > 0) result += carry;
        return new StringBuilder(result).reverse().toString();
    }
}