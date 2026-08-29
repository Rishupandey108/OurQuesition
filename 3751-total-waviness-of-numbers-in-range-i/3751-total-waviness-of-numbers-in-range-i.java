class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int result =0;
        for(int i=num1;i<=num2;i++){

            result += valley(String.valueOf(i));
        }

        return result;
    }

    public static int valley(String st){

        int count =0;
        for(int i=1;i<st.length()-1;i++){
            if(st.charAt(i)>st.charAt(i-1)&&st.charAt(i)>st.charAt(i+1) || st.charAt(i)<st.charAt(i-1)&&st.charAt(i)<st.charAt(i+1)){
                count+=1;
            }
        }

        return count;
    }
}