class Solution {
    public int maxVowels(String s, int k) {
     
       String str ="aeiou";
       
       int count=0;
       for(int i=0;i<=k-1;i++){
        if(str.indexOf(s.charAt(i))!=-1) count++;
       }

       int result =count;

       for(int i=k;i<=s.length()-1;i++){
        if(str.indexOf(s.charAt(i))!=-1)count++;
        if(str.indexOf(s.charAt(i-k))!=-1) count--;
        result=Math.max(result,count);
       }

    return result;
    }
}