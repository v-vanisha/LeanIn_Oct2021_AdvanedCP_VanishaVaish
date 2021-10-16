class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> list=new ArrayList<Integer>();
   public void dfs(int s,ArrayList<ArrayList<Integer>>adj,boolean visited[])
   {
       list.add(s);
       visited[s]=true;
       for(int u: adj.get(s)){
           if(visited[u]==false){
               dfs(u,adj,visited);
           }
       }
   }
   public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean  visited[]=new boolean[V+1];
       dfs(0,adj,visited);
       
       return list;
   }
}
