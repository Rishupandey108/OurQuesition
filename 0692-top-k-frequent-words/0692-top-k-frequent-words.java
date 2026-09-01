class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> hsmp = new HashMap<>();

        for(String s:words){
            hsmp.put(s,hsmp.getOrDefault(s,0)+1);
        }

        String[][] arr =new String[hsmp.size()][2];

        int i=0;

        for(String s :hsmp.keySet()){

                arr[i][0] = s;
                arr[i][1] = String.valueOf(hsmp.get(s));
                i++;

        }


        Arrays.sort(arr,(a,b)->{

           int pointA = Integer.parseInt(a[1]);
           int pointB = Integer.parseInt(b[1]);

           if(pointA!=pointB){
            return Integer.compare(pointB,pointA);
           }

           return  a[0].compareTo(b[0]);

        
        });

        int j=0;

        List<String> lst = new ArrayList<>();

        for(int l=0;l<k;l++){

            lst.add(arr[j][0]);
            j++;
        }

        return lst;


    }
}