class Solution {
    private static final int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int row,col;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        row = image.length;
        col = image[0].length;
        int oldColor = image[sr][sc];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});
        image[sr][sc]=newColor;
        while (!queue.isEmpty()){
            int[] point = queue.poll();
            int curRow = point[0];
            int curCol = point[1];
            for(int[]d:Directions){
                int r = curRow+d[0];
                int c = curCol+d[1];
                if(r<0||r>=row||c<0||c>=col||image[r][c]==newColor||image[r][c]!=oldColor){
                    continue;
                }
                image[r][c]=newColor;
                queue.add(new int[]{r,c});
            }
        }
        return image;
    }
}