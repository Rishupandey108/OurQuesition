class Solution {


    public static class Edges{
            int src;
            int dest;
            Edges(int s,int d){
                this.src = s;
                this.dest = d;
            }
    }

    public static boolean isCycleExist(ArrayList<Edges>graph[],boolean[]vis,int curr,boolean[]rec){
        vis[curr] = true;
        rec[curr] =true;

        for(int i=0;i<graph[curr].size();i++){
            Edges e = graph[curr].get(i);

            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(isCycleExist(graph,vis,e.dest,rec)){
                    return true;
                }
            }
        }

        rec[curr] = false;
        return false;
    }

    public static void topologicalsort(ArrayList<Edges>Graph[],boolean[]vis,Stack<Integer>st,int curr){

        vis[curr] = true;

        for(int i=0;i<Graph[curr].size();i++){
            Edges e = Graph[curr].get(i);

            if(!vis[e.dest]){
                topologicalsort(Graph,vis,st,e.dest);
            }
        }

        st.push(curr);
    }


    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int v = numCourses;
        ArrayList<Edges>Graph[] = new ArrayList[v];

        for(int i=0;i<v;i++){
            Graph[i] = new ArrayList<Edges>();
        }


        for(int arr[]:prerequisites){
            Graph[arr[1]].add(new Edges(arr[1],arr[0]));
        }


        Stack<Integer> st = new Stack<>();
        boolean [] vis = new boolean[v];
        boolean [] rec = new boolean[v];


        for(int i=0;i<v;i++){

                if(!vis[i]){
                    if(isCycleExist(Graph,vis,i,rec)){
                        return new int[]{};
                    }
                }
        }

        Arrays.fill(vis,false);

        for(int i=0;i<v;i++){
            if(!vis[i]){
                topologicalsort(Graph,vis,st,i);
            }
        }


        int []result = new int[st.size()];

        int i=0;
        while(!st.isEmpty()){
            result[i++] = st.pop();
        }

        return result;
    }
}