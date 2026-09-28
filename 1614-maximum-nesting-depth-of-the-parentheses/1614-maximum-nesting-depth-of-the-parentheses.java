class Solution {
    public int maxDepth(String s) {
       int numofpair =0, num =0;
       for(char ch:s.toCharArray())
       {
        if(ch=='(')
        {
            num++;
            numofpair = Math.max(numofpair,num);

        } else if(ch ==')')
        {
            num--;
        }
       }
       return numofpair; 
    }
}