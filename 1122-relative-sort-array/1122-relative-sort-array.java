class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        LinkedHashMap<Integer,Integer> hsmp = new LinkedHashMap<>();

        for(int a:arr2){
            hsmp.put(a,0);
        }

         for(int i=0;i<arr1.length;i++){
            if(hsmp.containsKey(arr1[i])){
                hsmp.put(arr1[i],hsmp.getOrDefault(arr1[i],0)+1);
            }else{
                Arrays.sort(arr1,i,arr1.length);
                  hsmp.put(arr1[i],hsmp.getOrDefault(arr1[i],0)+1);
            }
         }

        int k=0;

        for(int key:hsmp.keySet()){

                for(int i=0;i<hsmp.get(key);i++){
                        arr1[k]=key;
                        k++;
                }
        }

        return arr1;

    }
}