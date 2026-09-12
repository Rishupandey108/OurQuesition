class Solution {
    public boolean validDigit(int n, int x) {
        if(n==0 && x==0) return false;
        List<Integer> lst = new ArrayList<>();
        int count=0;

        while(n>0){
            int temp = n%10;
            if(temp==x) count++;
            lst.add(temp);
            n/=10;
        }

        if(lst.size()>=1&&lst.get(lst.size()-1)==x){
            return false;
        } 
        if(lst.size()==0){
            return false;
        }

        return count>=1;
    }
}