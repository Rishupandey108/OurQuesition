class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();

        int n = graph.length;

        int[] check = new int[n];


        for(int i =0;i<n;i++){

            if(dfs(i,graph,check)){
                result.add(i);
            }
        }

        return result;
    }

    public static boolean dfs(int curr, int[][]graph,int[]vis){

        if(vis[curr]>0) return vis[curr]==2;

        vis[curr] = 1;

        for(int a:graph[curr]){
            if(vis[curr]==1 &&!dfs(a,graph,vis)){
                return false;
            }
        }

        vis[curr] = 2;
        return true;
    }
}