class Solution {

    public static class Edges{
        int src;
        int dest;
        Edges(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static boolean dfs(int curr,ArrayList<Edges>graph[],boolean[]vis,boolean[]rec){
        vis[curr] = true;
        rec[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edges e = graph[curr].get(i);

            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(dfs(e.dest,graph,vis,rec)){
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();

        ArrayList<Edges>Graph[] = new ArrayList[graph.length];

        for(int i=0;i<graph.length;i++){
            Graph[i]=new ArrayList<Edges>();
        }

        for(int i=0;i<graph.length;i++){
            for(int a:graph[i]){
                Graph[i].add(new Edges(i,a));
            }
        }

        boolean vis[] = new boolean[graph.length];
        boolean rec[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){

                if(!dfs(i,Graph,vis,rec)){
                        result.add(i);
                }
        }

        return result;
    }
}