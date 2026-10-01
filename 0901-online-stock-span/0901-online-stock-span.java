class StockSpanner {

    ArrayList<Integer> lst;

    public StockSpanner() {
        lst = new ArrayList<>();
    }
    
    public int next(int price) {
        int count =0;

        for(int i=lst.size()-1;i>=0;i--){
            if(lst.get(i)<=price){
                count+=1;
            }else{
                break;
            }
        }

        lst.add(price);
        return count+=1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */