class Solution {
    public int minMaxDifference(int num) {
          
          String number = String.valueOf(num);
          int size = number.length();

          String max = "";
          String min = "";
            char ch =' ';

            for(int i=0;i<size;i++){
                    if(number.charAt(i)!='9'){
                        ch = number.charAt(i);
                        break;
                    }
            }


            for(int i=0;i<size;i++){

                    if(number.charAt(i)==ch) max+='9';
                    else max+=number.charAt(i);
            }

            for(int i=0;i<size;i++){

                    if(number.charAt(0)==number.charAt(i)) min+='0';
                    else min+=number.charAt(i);
            }

            return Integer.valueOf(max)-Integer.valueOf(min);
    }
}