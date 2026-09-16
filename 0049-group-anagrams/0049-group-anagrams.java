class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hsmp = new HashMap<>();

        for(String st:strs){

            char [] arr = st.toCharArray();

            Arrays.sort(arr);

            String s = new String(arr);
            hsmp.computeIfAbsent(s,k->new ArrayList<>()).add(st);
        }


        List<List<String>> result = new ArrayList<>();

        for(List<String> l:hsmp.values()){
            result.add(l);
        }

        return result;
    }
}