class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st = new StringBuilder();
        int balance =0;

        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                    if(balance>0)
                    {
                        st.append(ch);
                    }
                    balance++;
            }else {
                balance--;
                if(balance>0)
                {
                    st.append(ch);
                }
            }
        }
        return st.toString();
         
    }
}