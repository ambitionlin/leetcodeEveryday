class Solution {
    private int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int m,n;
    public  int numIslands(char[][] grid){
        Queue<int[]> queue = new LinkedList<>();
        m = grid.length;
        if(m==0){
            return 0;
        }
        n = grid[0].length;
        int level = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    level++;
                    grid[i][j]='0';
                    queue.add(new int[]{i,j});
                    while (!queue.isEmpty()){
                        int[] point = queue.poll();
                        int row = point[0];
                        int col = point[1];
                        for(int[] d:Directions){
                            int r = row+d[0];
                            int c = col+d[1];
                            if(r<0||r>=m||c<0||c>=n||grid[r][c]=='0'){
                                continue;
                            }
                            grid[r][c]='0';
                            queue.add(new int[]{r,c});
                        }
                    }
                }
            }
        }
        return level;
    }
}