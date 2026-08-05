class Solution {

    class Edges{
        int src;
        int dest;
        Edges(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public  void dfs(ArrayList<Edges>graph[],int curr,boolean [] vis){
        
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edges e = graph[curr].get(i);

            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
            
        }
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
       ArrayList<Edges> Graph[] = new ArrayList[n];

       for(int i=0;i<n;i++){
        Graph[i] = new ArrayList<Edges>();
       }

        for(int ar[]:invocations){
            Graph[ar[0]].add(new Edges(ar[0],ar[1]));
        }

        boolean vis[] = new boolean[n];
        dfs(Graph,k,vis);

        for(int edge[]:invocations){
            int u = edge[0];
            int v = edge[1];

            List<Integer> lst = new ArrayList<>();
            if(!vis[u] && vis[v]){
                for(int i=0;i<n;i++){
                       lst.add(i); 
                }
                return lst;
            }
            
        }

        List<Integer> result = new ArrayList<>();

        
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                result.add(i);
            }
        }

        return result;

    }
}