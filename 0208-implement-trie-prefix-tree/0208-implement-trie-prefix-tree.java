class Trie {
        List<String> lst;
    public Trie() {
        lst =new ArrayList<>();
    }
    
    public void insert(String word) {
        lst.add(word);
    }
    
    public boolean search(String word) {
            return lst.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for(String st:lst){
            if(st.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */