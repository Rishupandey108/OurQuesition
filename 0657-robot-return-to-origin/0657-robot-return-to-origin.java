class Solution {
    public boolean judgeCircle(String moves) {
        int U =0,D=0,L=0,R=0;

        for(char ch:moves.toCharArray()){
            if(ch=='U') U+=1;
            if(ch=='D') D+=1;
            if(ch=='L') L+=1;
            if(ch=='R') R+=1;
        }

        return U==D && L==R;
    }
}