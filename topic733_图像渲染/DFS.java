class Solution {
    private static final int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int row,col;
    private int oldColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        oldColor = image[sr][sc];
        row = image.length;
        col = image[0].length;
        dfs(image,sr,sc,newColor);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int newColor){
        if(r<0||r>=row||c<0||c>=col||image[r][c]==newColor||image[r][c]!=oldColor){
            return;
        }
        image[r][c]=newColor;
        for(int[] d:Directions){
            int rr = r+d[0];
            int cc = c+d[1];
            dfs(image,rr,cc,newColor);
        }
    }
}