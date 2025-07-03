class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0;i < s.length(); i++) {
            char left = s.charAt(i);
            if(!st.isEmpty()){
                char right = st.peek();
                if(isPair(left,right)){
                    st.pop();
                    continue;
                }
            }
            st.push(left);
        }
        return st.isEmpty();
    }

    public boolean isPair(char left, char right){
        return
        (right == '(' && left ==')')
        || (right == '[' && left == ']')
        || (right == '{' && left == '}');
    }
}
