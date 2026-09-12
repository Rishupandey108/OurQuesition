class Solution {
    public int distMoney(int money, int children) {
         
        if(money<children) return -1;

        money-=children;
        int result =0;

        while(money>=7 && children>0){
            money-=7;
            children-=1;
            result+=1;
        }

        if(result==0) return 0;

        if(children==0 && money>0) result-=1;
        if(children==1 && money==3)  result-=1;


        return result;

       
    }
}