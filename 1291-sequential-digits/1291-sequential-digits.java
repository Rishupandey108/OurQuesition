class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       String st ="123456789";

       List<Integer> lst = new ArrayList<>();

       for(int i=2;i<10;++i){

        for(int j=0;j<=st.length()-i;++j){
            int temp = Integer.parseInt(st.substring(j,j+i));

            if(temp>=low && temp<=high){
                lst.add(temp);
            }
        }
       } 
       return lst;
    }
}