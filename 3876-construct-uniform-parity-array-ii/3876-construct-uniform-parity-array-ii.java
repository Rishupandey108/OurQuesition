class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int smallnumber = Integer.MAX_VALUE;

        for(int a:nums1){
                smallnumber = Math.min(smallnumber,a);
        }

        int parity = nums1[0]%2;

        for(int i=1;i<nums1.length;i++){

            if(nums1[i]%2!=parity){

            
                if((nums1[i]-smallnumber)%2!=parity){
                    return false;
                }
            }
        }

        return true;
    }
}