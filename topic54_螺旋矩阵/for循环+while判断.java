class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        if(m==0){
            return list;
        }
        int n = matrix[0].length;
        int r=0,c=0,row=m-1,col=n-1;
        while(r<=row&&c<=col){
            for(int j=c;j<=col;j++){
                list.add(matrix[r][j]);
            }
            for(int i=r+1;i<=row;i++){
                list.add(matrix[i][col]);
            }
            if(r<row){
                for(int j=col-1;j>=c;j--){
                    list.add(matrix[row][j]);
                }
            }
            if(c<col){
                for(int i=row-1;i>r;i--){
                    list.add(matrix[i][c]);
                }
            }
            r++;c++;row--;col--;
        }
        return list;
    }
}