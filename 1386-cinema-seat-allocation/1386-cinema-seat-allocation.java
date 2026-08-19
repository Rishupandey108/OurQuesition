class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
       
      HashMap<Integer,Integer> hsmp = new HashMap<>();

      for(int []seats:reservedSeats){

        if(seats[1]>=2 && seats[1]<=9){

        hsmp.put(seats[0],hsmp.getOrDefault(seats[0],0) | (1<<seats[1]));

        }
      }


      int result = 2*(n-hsmp.size());

      int left = (1<<2) | (1<<3) | (1<<4) | (1<<5);
      int  middle = (1<<4) | (1<<5) | (1<<6) | (1<<7);
      int  right = (1<<6) | (1<<7) | (1<<8) | (1<<9);

      for(int val : hsmp.values()){
            boolean LeftOne = (val & left)==0;
            boolean MiddleOne = (val & middle) ==0;
            boolean RightOne = (val & right) ==0;

            if(LeftOne && RightOne){

                result+=2;

            }else if(LeftOne || MiddleOne || RightOne){

                result+=1;

            }

      }
      return result;


    }
}