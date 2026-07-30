class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st = new Stack<>();
       String s = "1023456789";

       for(String str : operations){

         if(str.equals("+")){

            

                int prev1 = st.pop();
                int prev2 = st.peek();
                int temp = prev1+prev2;
                st.push(prev1);
                 
                st.push(temp);
           

         }else if(str.equals("D")){

             

                st.push(2*st.peek());

             

         }else if(str.equals("C")){

            st.pop();

         }else {
            st.push(Integer.parseInt(str));
         }


       } 

       int sum =0;

       while(!st.isEmpty()){

            sum +=st.pop();
       }

       return sum;
    }
}