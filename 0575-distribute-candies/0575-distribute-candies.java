class Solution {
    public int distributeCandies(int[] candyType) {
        
       HashSet<Integer> hst = new HashSet<>();

       int result =0;

       for(int a:candyType){

            if(hst.contains(a)){
                continue;
            }else{
                hst.add(a);
                result+=1;
            }

            if(result==candyType.length/2){
                break;
            }
       }

       return result;
    }
}