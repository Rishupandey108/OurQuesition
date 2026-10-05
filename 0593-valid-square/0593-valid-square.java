class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
      

        HashSet<Integer> hst = new HashSet<>();

        hst.add(dist(p1,p2));
        hst.add(dist(p1,p3));
        hst.add(dist(p1,p4));
        hst.add(dist(p2,p3));
        hst.add(dist(p2,p4));
        hst.add(dist(p3,p4));

        return !hst.contains(0) && hst.size()==2;

    }

    public int dist(int x[],int y[]){

        return (x[0]-y[0])*(x[0]-y[0])+(x[1]-y[1])*(x[1]-y[1]);
    }
}