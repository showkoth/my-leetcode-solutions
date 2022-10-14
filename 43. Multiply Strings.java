class Solution {
    private void init(int[] a){
        int sz = a.length;
        for(int i = 0; i < sz; i++){
            a[i] = 0;
        }
    }
    private String arrayToString(int[] a){
        String str = "";
        boolean flag = false;
        for(int i=0;i<a.length;i++)
        {
            if(flag == false && a[i] > 0){
                flag = true;
            }
            if(flag){
                str = str + Integer.toString(a[i]);
            }
        }
        return str;
    }
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] a = new int[m+n];
        init(a);
        int carry = 0;
        int i,j;
        for(i = n - 1; i >= 0; i--){
            for(j = m - 1; j >= 0; j--){
                int x = num1.charAt(j) - '0';
                int y = num2.charAt(i) - '0';
                int mul = a[i + j + 1] + x * y + carry;
                a[i + j + 1] = mul % 10;
                carry = mul / 10;
            }
            if(carry > 0 && i + j >= 0){
                a[i + j + 1] = carry;
                carry = 0;
            }
        }
        if(carry > 0) a[0] = carry;
        String res = arrayToString(a);
        return res.isEmpty() ? "0" : res;
    }
}