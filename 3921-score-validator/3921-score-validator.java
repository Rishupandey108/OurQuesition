class Solution {
    public int[] scoreValidator(String[] events) {
        int score =0,counter =0;

        for(String s:events){

            if(s.equals("W")){
                counter+=1;
            }else if(s.equals("WD")){
                score+=1;
            }else if(s.equals("NB")){
                score+=1;
            }else{
                score+= Integer.parseInt(s);
            }

            if(counter>=10){
                break;
            }
        }

        return new int[]{score,counter};
    }
}