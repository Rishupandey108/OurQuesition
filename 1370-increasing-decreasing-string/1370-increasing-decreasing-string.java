class Solution {
    public String sortString(String s) {
        
        int arr[] = new int[26];

        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        while(sb.length()!=s.length()){

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    sb.append((char)('a'+i));
                    arr[i]--;
                }
            }

            for(int i=25;i>=0;i--){
                if(arr[i]>0){
                    sb.append((char)('a'+i));
                    arr[i]-=1;
                }
            }
        }

        return sb.toString();
    }
}