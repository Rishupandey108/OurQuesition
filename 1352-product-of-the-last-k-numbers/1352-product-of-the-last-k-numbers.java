class ProductOfNumbers {
    ArrayList<Integer> lst;
    public ProductOfNumbers() {
        lst = new ArrayList<>();
    }
    
    public void add(int num) {
        lst.add(num);
    }
    
    public int getProduct(int k) {
        int result =1;
        

        for(int i=0;i<k;i++){
            result *= lst.get(lst.size()-1-i);
        }

        return result;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */