class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len; i++){
            var c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                var top = stack.peek();
                if((c == ')' && top == '(') || (c == '}' && top == '{')
                   || (c == ']' && top == '[')){
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
}