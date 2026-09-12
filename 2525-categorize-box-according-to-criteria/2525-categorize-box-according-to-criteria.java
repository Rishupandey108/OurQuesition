class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        

         boolean  Bulky = false;
        boolean Heavy = false;

        long vol = (long)length * width * height;

        if(vol>=1_000_000_000 || length>=10000 || width >=10000 || height>=10000){
            Bulky = true;
        }

        if(mass>=100){
                Heavy = true;
        }

        if(Bulky && Heavy){
         return "Both";
        }

        if(Bulky &&!Heavy) { 
            return "Bulky";
            }

         if(Heavy && !Bulky){ 
            return "Heavy";
            }

         return "Neither";
    }
}