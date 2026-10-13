class Solution {
    public int maxDiff(int num) {
        

        HashSet<Character> hst = new HashSet<>();

        String ourvalue = String.valueOf(num);

        for(char ch:ourvalue.toCharArray()){
            hst.add(ch);
        }

         int minimum = num,maximum = num;

         for(char digit:hst){

            for(char ch='0';ch<='9';ch++){

                if(ourvalue.charAt(0)==digit&& ch=='0')continue;

                String currstring = ourvalue.replace(digit,ch);

                int currvalue = Integer.parseInt(currstring);

                minimum = Math.min(currvalue,minimum);
                maximum = Math.max(currvalue,maximum);
            }
         }

         return maximum-minimum;
    }
}