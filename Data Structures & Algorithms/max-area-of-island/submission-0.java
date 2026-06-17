class Solution {

    private int numOfIslands = 0;
    private int maxIslands  = 0;
    public int dfs(int[][] grid, boolean[][]visited, int i, int j ){
        int[] pom_i = new int[] {0, 0, 1, -1};
        int[] pom_j = new int[] {1, -1, 0 , 0};
        
        visited[i][j] = true;
        numOfIslands++;
      
        if(numOfIslands>maxIslands){
            maxIslands = numOfIslands;
        }
        

        for(int k=0;k<4;k++){
            int new_i = i+pom_i[k];
            int new_j = j+pom_j[k];
            if(new_i >= 0 && new_i < grid.length  && new_j >= 0 && new_j < grid[0].length && !visited[new_i][new_j] && grid[new_i][new_j] == 1){
                visited[new_i][new_j] = true;
                dfs(grid, visited, new_i, new_j);
            }
            
        }
        return numOfIslands;
    }

    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;

        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0){
                    visited[i][j] = true;
                    
                }

                if(grid[i][j] == 1 && visited[i][j] == true)
                    continue;

                if(grid[i][j] == 1 && visited[i][j] == false){
                    numOfIslands = 0;
                    visited[i][j] = true;
                    int currentArea = dfs(grid, visited, i, j);
                    maxArea = Math.max(maxArea, currentArea);
                }

            }
        }

        return maxArea;
    }
}
