class Solution {
    public boolean isPathCrossing(String path) {
         HashSet<String> hst = new HashSet<>();

         int x = 0;
         int y =0;
         hst.add("0,0");

         for(char ch:path.toCharArray()){

            if(ch=='N'){
                y++;
            }else if(ch=='E'){
                x++;
            }else if(ch=='S'){
                y--;
            }else{
                x--;
            }

            String temp = x+","+y;

            if(hst.contains(temp)){
                return true;
            }

            hst.add(temp);

         }

         return false;
    }
}