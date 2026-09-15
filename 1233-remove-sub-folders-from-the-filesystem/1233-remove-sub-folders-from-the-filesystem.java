class Solution {
    public List<String> removeSubfolders(String[] folder) {
        
        Arrays.sort(folder);
        List<String> lst = new ArrayList<>();

        lst.add(folder[0]);

        for(int i=1;i<folder.length;i++){

            String base =  lst.get(lst.size()-1)+"/";

            if(!folder[i].startsWith(base)){
                lst.add(folder[i]);
            }
        }

        return  lst;
        
    }
}