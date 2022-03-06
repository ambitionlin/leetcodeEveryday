import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Main {
    private static final int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private static int m,n;
    private int level = 0;
    public int[][] updateMatrix(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        Queue<int[]> queue =  new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    queue.add(new int[]{i,j});
                }else{
                    matrix[i][j]=101;
                }
            }
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            level++;
            while(size-->0){
                int[] point = queue.poll();
                int row = point[0];
                int col = point[1];
                for(int[] d:Directions){
                    int r = row+d[0];
                    int c = col+d[1];
                    if(r<0||r>=m||c<0||c>=n||matrix[r][c]<=matrix[row][col]){
                        continue;
                    }
                    matrix[r][c]=level;
                    queue.add(new int[]{r,c});
                }
            }
        }
        return matrix;
    }
}
