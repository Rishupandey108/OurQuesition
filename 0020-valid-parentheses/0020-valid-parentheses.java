class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
         
        for(char st:s.toCharArray())
        {
            if(st=='{'||st=='('||st=='[')
            {
                stack.push(st);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(st=='}' && top!='{') return false;
                if(st==')'&& top!='(') return false;
                if(st==']' && top!='[') return false;
            }
        }
        return stack.empty();
    }
}