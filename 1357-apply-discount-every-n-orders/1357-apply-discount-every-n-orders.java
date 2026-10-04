class Cashier {

    int n;
    int discount;
    HashMap<Integer,Integer> hsmp;
    int k =0;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        hsmp = new HashMap<>();

        for(int i=0;i<products.length;i++){
            hsmp.put(products[i],prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        ++k;

        double TotalBill =0;

        for(int i=0;i<product.length;i++){
            TotalBill += hsmp.get(product[i])*amount[i];
        }

        if(k%n==0){
            TotalBill = TotalBill * (100 - discount)/100;
        }

        return TotalBill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */