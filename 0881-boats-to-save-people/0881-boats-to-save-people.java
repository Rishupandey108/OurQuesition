class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);


        int left =0;
        int right = people.length-1;
        int result =0;

        while(left<=right){

            if(people[left]+people[right]<=limit){
                result+=1;
                left+=1;
                right-=1;
            }else {

                if(people[right]<=limit){
                    right-=1;
                    result+=1;
                }else{
                    result+=1;
                    left+=1;
                }
            }
        }

        return result;

    }
}