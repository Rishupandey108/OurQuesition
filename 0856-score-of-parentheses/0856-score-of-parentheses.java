class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer> st = new Stack<>();

       for(char ch:s.toCharArray()){
        if(ch=='('){

            st.push(-1);

        }else if(ch==')'){

            if(st.peek()==-1){
                st.pop();
                st.push(1);
            }else {
                int temp =0;

                while(st.peek()!=-1){
                    temp+=st.pop();
                }
                st.pop();
                st.push(2*temp);
            }
        }
       }
       
       int result =0;

       while(!st.isEmpty()){
        result+=st.pop();
       }

       return result;
    }
}