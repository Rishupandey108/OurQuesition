class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        // if(Arrays.equals(A,B))
        // {
        //     Arrays.sort(A); return A;
        // }
         HashMap<Integer,Integer> hsmp = new HashMap<>();

          int [] result= new int[A.length];
        //   result[0]=A[0]==B[0]?1:0;

        //   hsmp.put(A[0],1);
        //   hsmp.put(B[0],1);

          for(int i=0;i<A.length;i++){
                hsmp.put(A[i],hsmp.getOrDefault(A[i],0)+1);

                 hsmp.put(B[i],hsmp.getOrDefault(B[i],0)+1);
                 int count =0;

                 for(int j=0;j<=i;j++){
                    if(hsmp.get(A[j])==2) count++;
                      
                 }

                 result[i] = count;
          }

          return result;


    }
}