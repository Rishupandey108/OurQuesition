class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
          
           HashSet<Integer> hst = new HashSet<>();

           for(int a:friends){
                
                hst.add(a);
           }

           int j=0;

           for(int a:order){
                if(hst.contains(a)){
                    friends[j++] = a;
                }
           }

           return friends;

    }
}