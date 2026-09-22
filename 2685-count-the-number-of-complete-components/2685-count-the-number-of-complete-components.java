class Solution {
    
    class Node{
        int src;
        int dest;
        Node(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    int vertices;
    int Edges;

    public void Dfs(ArrayList<Node>Graph[],boolean[]vis,int curr){
                
                    vis[curr] = true;
                    Edges +=Graph[curr].size();
                    vertices+=1;

               for(Node node : Graph[curr]){
                    if(!vis[node.dest]){
                        Dfs(Graph,vis,node.dest);
                    }
               }

    }

    public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<Node>[]Graph = new ArrayList[n];

        for(int i=0;i<Graph.length;i++){
            Graph[i] = new ArrayList<Node>();
        }

        for(int arr[]:edges){
            Graph[arr[0]].add(new Node(arr[0],arr[1]));
            Graph[arr[1]].add(new Node(arr[1],arr[0]));
        }

        int count =0;
        boolean [] vis= new boolean[n];

        for(int i=0;i<n;i++){


            if(!vis[i]){
                vertices =0;
                this.Edges = 0;
            Dfs(Graph,vis,i);

            int needed = this.Edges/2;
            int totvertex = vertices*(vertices-1)/2;
            if(needed==totvertex){
                count+=1;
            }
            }

        }


        return count;

    }
}