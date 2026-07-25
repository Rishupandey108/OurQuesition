class Solution {


   static class Edges {
        int src;
        int dest;
        Edges(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

        public static  boolean  isCycle(ArrayList<Edges>graph[] ,boolean[] vis,int curr,boolean [] rec){

            vis[curr] = true;
            rec[curr] = true;

            for(int i=0;i<graph[curr].size();i++){
                    Edges e = graph[curr].get(i);

                    if(rec[e.dest]){
                        return true;
                    }else  if(!vis[e.dest]){
                            if(isCycle(graph,vis,e.dest,rec)){
                                return true;
                            }
                    }
            }

            rec[curr] = false;

            return false;

        }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0) return true;
        int v =numCourses;

        ArrayList<Edges> Graph[] = new ArrayList[v];
         
         for(int i=0;i<v;i++){
            Graph[i] = new ArrayList<Edges>();
         }


         for(int [] arr:prerequisites){
            Graph[arr[1]].add(new Edges(arr[1],arr[0]));
            
         }

        
      boolean result = false;

      boolean vis [] = new boolean[v];
      boolean rec[]  = new boolean[v];

      for(int i=0;i<v;i++){
            if(!vis[i]){
                result |=isCycle(Graph,vis,i,rec);
            }
      }

        

       return !result;
         
    }
}