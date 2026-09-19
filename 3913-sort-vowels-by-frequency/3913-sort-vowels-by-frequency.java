class Solution {
    public String sortVowels(String s) {
         
         StringBuilder sb = new StringBuilder(s);

       LinkedHashMap<Character,Integer> hsmp =new LinkedHashMap<>();

        for(char ch:s.toCharArray()){
            if(isvowel(ch)){
            hsmp.put(ch,hsmp.getOrDefault(ch,0)+1);
            }
        }

        int[][] arr = new int[hsmp.size()][2];
        
        int tot =0;
        int i=0;
        for(char ch:hsmp.keySet()){
            arr[i][0] = ch;
            arr[i][1] = hsmp.get(ch);
            i++;
        }
        
         
        i=0;

        String vow = "aeiouAEIOU";

        // Arrays.sort(arr,(a,b)->{
        //     if(a[1]!=b[1]){
        //          return Integer.compare(b[1],a[1]);
        //     }
        //     return Integer.compare( 
        //         vow.indexOf((char)b[0]),
        //         vow.indexOf((char)a[0])
        //     );
        // });

            Arrays.sort(arr,(a,b)-> Integer.compare(b[1],a[1]));

        int k =0;
        for(int j=0;j<arr.length;j++){
             
            int freq = arr[j][1];
            while(freq-- > 0){

                while(!isvowel(sb.charAt(k))){
                        k++;
                }
                sb.setCharAt(k,(char)(arr[j][0]));
                k+=1;

            }
        }

        return sb.toString();


    }

    private boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}