class Solution {


    class Edges{
        int src;
        int dest;
        Edges(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }


    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        List<Integer> result = new ArrayList<>();

        if(n==1){
            result.add(0);
            return result;
        }
        ArrayList<Edges>Graph[] = new ArrayList[n];

        for(int i=0;i<n;i++){
            Graph[i] = new ArrayList<Edges>();
        }

        Queue<Integer> q = new LinkedList<>();

        int [] leafcount = new int[n];

        for(int arr[]:edges){

            Graph[arr[0]].add(new Edges(arr[0],arr[1]));
            Graph[arr[1]].add(new Edges(arr[1],arr[0]));

            leafcount[arr[0]]++;
            leafcount[arr[1]]++;

        }

        for(int i=0;i<n;i++){
            if(leafcount[i]==1){
                q.offer(i);
            }
        }

        int count = n;

        while(n>2){

            int size = q.size();
            n-=size;

            for(int i=0;i<size;i++){
                
                int curr = q.poll();

                

                for(int j=0;j<Graph[curr].size();j++){
                    Edges e = Graph[curr].get(j);

                    leafcount[e.dest]--;
                    if(leafcount[e.dest]==1){
                        q.offer(e.dest);
                    }
                }

            }

        }

        

        result.addAll(q);

        return result;
    }
}