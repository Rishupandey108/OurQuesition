class Solution {
   
    public boolean isAlienSorted(String[] words, String order) {
         int arr[] = new int[26];
         
         for(int i=0;i<order.length();i++){
             arr[order.charAt(i)-'a']=i;
         }
        for(int i=0;i<words.length-1;i++){

            if(!checkAlien(words[i],words[i+1],arr)){
                return false;
            }
        }

        return true;
          
    }

    public boolean checkAlien(String st1, String st2 , int[]arr){
            int l1 = st1.length();
            int l2 = st2.length();
            int min  = Math.min(l1,l2);

            for(int i=0;i<min;i++){

                if(st1.charAt(i)!=st2.charAt(i)){
                         int curr1 = arr[st1.charAt(i)-'a'];
                        int curr2 = arr[st2.charAt(i)-'a'];

                        return curr1<curr2;
                }    
            }

            return  l1<=l2;
    }
}