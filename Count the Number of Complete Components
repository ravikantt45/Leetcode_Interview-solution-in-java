class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        boolean visited[]= new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                List<Integer> com = new ArrayList<>();
                if(bfs(i ,adjList, visited, com) && isComplete(com, adjList)){
                    cnt++;
                }
            }
        }

        return cnt;
    }


    public boolean bfs(int start, List<List<Integer>> adjList, boolean visited[], List<Integer> com){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int node = q.poll();
            com.add(node);

            for(int neg : adjList.get(node)){
            if(!visited[neg]){
                visited[neg]=true;
                q.add(neg);
            }
            }
        }
    return true;    
    }

        private boolean isComplete(List<Integer> component, List<List<Integer>> adjList) {
        int size = component.size();
        for (int node : component) {
            if (adjList.get(node).size() != size - 1) {
                return false;
            }
        }
        return true;
    }

}
