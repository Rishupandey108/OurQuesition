class Solution {
    public int numRabbits(int[] answers) {
        
         Arrays.sort(answers);

         int result =0;
         int count =0;

         for(int i=0;i<answers.length;i++){

            if(answers[i]==0){
                result+=1;
            }else if(i==0 || answers[i]!=answers[i-1] || count==0){

                result+= answers[i]+1;
                count=answers[i];
            }else{
                count-=1;
            }
         }

         return result;
    }
}