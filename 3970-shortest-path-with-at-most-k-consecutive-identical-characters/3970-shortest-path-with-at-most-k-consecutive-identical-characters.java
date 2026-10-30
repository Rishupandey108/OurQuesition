class Solution {

    class Edges{
        int src;
        int dest;
        int wt;
        Edges(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }


    class Node implements Comparable<Node>{

        int src;
        int count;
        int weight;
        Node(int s,int c,int w){
            this.src = s;
            this.count = c;
            this.weight = w;
        }

         
         @Override
        public int compareTo(Node t){
            return this.weight - t.weight;
        }
    }


    public int shortestPath(int n, int[][] edges, String labels, int k) {
        
        ArrayList<Edges>Graph[] = new ArrayList[n];

        for(int i=0;i<n;i++){
            Graph[i] = new ArrayList<Edges>();
        }

        for(int i=0;i<edges.length;i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            int wt = edges[i][2];
            Graph[src].add(new Edges(src,dest,wt));
        }


        int dist[][] = new int[n][k+1];

        for(int arr[]:dist){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }

        dist[0][1]=0;

        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.add(new Node(0,1,0));

        while(!pq.isEmpty()){

            Node curr = pq.remove();

            int u = curr.src;
            int count = curr.count;
            int wt = curr.weight;

            if(u==n-1){
                return wt;
            }

            if(wt>dist[u][count]){
                continue;
            }

            for(int i=0;i<Graph[u].size();i++){
                    Edges e = Graph[u].get(i);

                   int next_Count = labels.charAt(u)==labels.charAt(e.dest)?count+1:1;
                   
                   if(next_Count>k){
                    continue;
                   }

                   int next_Weight = wt+e.wt;
                
                if(next_Weight<dist[e.dest][next_Count]){

                    dist[e.dest][next_Count] = next_Weight;
                    pq.add(new Node(e.dest,next_Count,next_Weight));
                }
            }

        }

        return -1;


    }
}