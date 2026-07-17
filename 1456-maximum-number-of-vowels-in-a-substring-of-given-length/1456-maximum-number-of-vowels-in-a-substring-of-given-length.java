class Solution {
    public int maxVowels(String s, int k) {
       String[] arr = s.split("");
       String str ="aeiou";
       
       int count=0;
       for(int i=0;i<=k-1;i++){
        if(str.contains(arr[i])) count++;
       }

       int result =count;

       for(int i=k;i<=arr.length-1;i++){
        if(str.contains(arr[i]))count++;
        if(str.contains(arr[i-k])) count--;
        result=Math.max(result,count);
       }

    return result;
    }
}