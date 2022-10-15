class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        var carry = '0';
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int sz = Math.max(a.length(), b.length());
        for(int i = 0; i < sz; i++){
            var x = (i >= a.length()) ? '0' : a.charAt(i);
            var y = (i >= b.length()) ? '0' : b.charAt(i);
            if(x == '1' && y == '1'){
                if(carry == '1'){
                    result += "1";
                }
                else{
                    result += "0";
                    carry = '1';
                }
            }
            else if(x == '0' && y == '0'){
                result += carry;
            }
            else{
                if(carry == '1'){
                    result += "0";
                    carry = '1';
                }
                else{
                    result += "1";
                }
            }
        }
        if(carry == '1') result += carry;
        return new StringBuilder(result).reverse().toString();
    }
}