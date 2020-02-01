class Solution{
     private int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
     private int m,n;
     private int Walls = -1;
     private int Gates = 0;
     private int level = 0;
    public void wallsAndGates(int[][] rooms){
        m = rooms.length;
        if(m==0){
            return;
        }
        n = rooms[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rooms[i][j]==Gates){
                    dfs(rooms,i,j);
                }
            }
        }
    }
    public void dfs(int[][] rooms, int r, int c){
        if(r<0||r>=m||c<0||c>=n||rooms[r][c]==Walls||rooms[r][c]<level){
            return;
        }
        rooms[r][c]=level;
        for(int[] d:Directions){
            int row = r+d[0];
            int col = c+d[1];
            level++;
            dfs(rooms,row,col);
            level--;
        }
    }
}