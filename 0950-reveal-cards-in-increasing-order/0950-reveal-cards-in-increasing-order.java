class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        int n = deck.length;
        Arrays.sort(deck);

        int[] res = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<deck.length;i++){
         q.add(i);
        }
           

        for(int i=0;i<deck.length;i++){

                res[q.poll()] = deck[i];
                q.add(q.poll());
        }
        

        return res;
    }
}