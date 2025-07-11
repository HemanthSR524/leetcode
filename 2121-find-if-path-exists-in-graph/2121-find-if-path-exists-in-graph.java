class Solution {
    int[] parent;
    int[] rank;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        rank = new int[n];

        for(int i =0;i < n; i++){
            parent[i] =i;
            rank[i] = 1;
        }
        for(int[] each : edges){
            union(each[0], each[1]);
        }
        return find(source) == find(destination);
    }
    private int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    private void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY){
            if(rank[rootX] > rank[rootY]) parent[rootY] = rootX;
            else if(rank[rootY] < rank[rootX]) parent[rootX] = rootY;
            else{
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }  
}