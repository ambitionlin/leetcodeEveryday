import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int m,n;
    private int level = 0;
    public int numIslands(char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        m = grid.length;
        if(m==0)
            return 0;
        n = grid[0].length;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(grid[i][j]==1){
                    level++;
                    queue.add(new int[]{i,j});
                    while (!queue.isEmpty()){
                        grid[i][j]=0;
                        for(int[] d:Directions){
                            int r = i+d[0];
                            int c = j+d[1];
                            if(r<0||r>=m||c<0||c>=n||grid[r][c]==0){
                                continue;
                            }
                            grid[r][c]=0;
                            queue.add(new int[]{r,c});
                        }
                    }
                }
            }
        }
    }
}