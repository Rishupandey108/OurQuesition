class Solution {
    public int countLargestGroup(int n) {

        HashMap<Integer,Integer> hsmp = new HashMap<>();
        if(n<10) return n;
       
       for(int i=0;i<=n;i++){
            int temp =0;

            int val = i;

            while(val>0){
                int v = val%10;

                temp+=v;
                val/=10;
            }

             hsmp.put(temp,hsmp.getOrDefault(temp,0)+1);
       }

        int max=0;

        for(int val : hsmp.values()){
            max = Math.max(max,val);
        }
    
        int result=0;

        for(int val:hsmp.values()){

                if(val==max){
                    result+=1;
                }
        }

        return result;

    }
}