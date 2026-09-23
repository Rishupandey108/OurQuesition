class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        HashSet<Integer> hst  = new HashSet<>();

        for(int a:bulbs){

            if(!hst.contains(a)){
                hst.add(a);
            }else{
                hst.remove(a);
            }
        }
        List<Integer> lst = new ArrayList<>(hst);

        Collections.sort(lst);
        return lst;
    }
}