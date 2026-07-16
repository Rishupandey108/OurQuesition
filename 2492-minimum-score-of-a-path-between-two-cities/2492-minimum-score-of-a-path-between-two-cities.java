class Solution {
    int result = Integer.MAX_VALUE;

     class Edges {
        int sr;
        int dest;
        int wt ;
        Edges(int s,int d,int w){
            this.sr=s;
            this.dest =d;
            this.wt=w;
        }
     }

    public int minScore(int n, int[][] roads) {
        
        ArrayList<Edges> graph[] = new ArrayList[n+1];

        for(int i=0;i<n+1;i++){
            graph[i] = new ArrayList<Edges>();
        }

         
        for(int road[]:roads){
            int sr = road[0];
            int dest = road[1];
            int wt = road[2];

            graph[sr].add(new Edges(sr,dest,wt));
            graph[dest].add(new Edges(dest,sr,wt));
        }


            boolean [] visited = new boolean[n+1];
            dfs(graph,1,visited);


            return result;
    }

    public  void dfs(ArrayList<Edges>graph[],int curr,boolean[]vis){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){

             Edges e = graph[curr].get(i);

             result = Math.min(result,e.wt);

             if(!vis[e.dest]){

                dfs(graph,e.dest,vis);

             }
        }
    }
}