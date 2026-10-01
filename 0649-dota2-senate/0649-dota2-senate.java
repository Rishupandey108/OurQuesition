class Solution {
    public String predictPartyVictory(String senate) {
        
       Queue<Integer> Radient = new LinkedList<>() , Dire = new LinkedList<>();

       int senatelen = senate.length();

       for(int i=0;i<senate.length();i++){

            if(senate.charAt(i)=='R'){
                Radient.add(i);
            }else {
                Dire.add(i);
            }
       }

       while(!Radient.isEmpty() &&!Dire.isEmpty()){

            if(Radient.peek()<Dire.peek()){

                Radient.add(senatelen++);
            }else{
                Dire.add(senatelen++);
            }

            Radient.remove();
            Dire.remove();
       }


       return Radient.isEmpty()?"Dire":"Radiant";
    }
}