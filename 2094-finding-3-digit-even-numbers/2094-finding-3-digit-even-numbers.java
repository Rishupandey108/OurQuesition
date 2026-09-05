class Solution {
    public int[] findEvenNumbers(int[] digits) {
      
        int count =0;
        HashSet<Integer> lst = new HashSet<>();

        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)continue;
            for(int j=0;j<digits.length;j++){
                if(i==j){
                    continue;
                }

                for(int k=0;k<digits.length;k++){

                    if(k==i || k==j){
                        continue;
                    }

                    int temp = digits[i]*100 + digits[j]*10 + digits[k];

                    if(temp%2==0){
                        lst.add(temp);
                    }
                }
            }
        }

        // Collections.sort(lst);

        int[] result = new int[lst.size()];
        int i=0;

        for(int a:lst){
            result[i++] = a;
        }

        Arrays.sort(result);
         

        return result;
           
    }

}