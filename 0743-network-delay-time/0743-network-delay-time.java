class Solution {


    static class Edges{
        int src;
        int dest;
        int wt;
        Edges(int s,int d,int w){
            this.src=s;
            this.dest = d;
            this.wt = w;
        }
    }

     static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int n,int d){
            this.node=n;
            this.dist = d;

        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }



    public static int dikstrasAlgo(ArrayList<Edges>graph[],int src ){
        PriorityQueue<Pair> p = new PriorityQueue<>();

            

         int dis[] = new int[graph.length];

        for(int i=0;i<graph.length;i++){

            if(i!=src){
                dis[i] = Integer.MAX_VALUE;
            }
        }

         boolean[] vis = new boolean[graph.length];

         p.add(new Pair(src,0));


         while(!p.isEmpty()){
            Pair curr = p.remove();

            if(!vis[curr.node]){
                vis[curr.node] = true;

            for(int j=0;j<graph[curr.node].size();j++){
                    Edges e = graph[curr.node].get(j);
                    int u = e.src;
                    int v = e.dest;

                    if(dis[u]+e.wt<dis[v]){
                        dis[v] = dis[u]+e.wt;
                        p.add(new Pair(v,dis[v]));
                    }
            }
            }


            }
            

    int result = -1;

    for(int i=1;i<dis.length;i++){
        result = Math.max(result,dis[i]);
    }

    return result;
    }


     

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edges> Graph[] = new ArrayList[n+1];

        for(int i=0;i<n+1;i++){
            Graph[i] = new ArrayList<Edges>();
        }

        for(int arr[]:times){
            Graph[arr[0]].add(new Edges(arr[0],arr[1],arr[2]));
        }

       

     int result = dikstrasAlgo(Graph,k);

        return result ==Integer.MAX_VALUE || result == Integer.MIN_VALUE ?-1:result;

    }
}