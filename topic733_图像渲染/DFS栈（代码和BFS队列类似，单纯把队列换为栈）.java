class Solution {
    private int[][] Directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int m,n;
    private int oldColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        m = image.length;
        n = image[0].length;
        oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{sr,sc});
        while (!stack.isEmpty()){
            int[] point = stack.pop();
            int row = point[0];
            int col = point[1];
            for(int[] d:Directions){
                int r = row+d[0];
                int c = col+d[1];
                if(r<0||r>=m||c<0||c>=n||image[r][c]!=oldColor||image[r][c]==newColor){
                    continue;
                }
                image[r][c] = newColor;
                stack.push(new int[]{r,c});
            }
        }
        return image;
    }
}