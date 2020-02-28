public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix)
    {
        if (matrix.length == 0) return new int[0];
        int m = matrix.length;      // 待处理的矩阵有M行、N列
        int n = matrix[0].length;
        int[] result = new int[m * n];  // 用来存放遍历的结果
        int r = 0;
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            if ((r + c) % 2 == 0) {
	    if (c == n - 1) { // 元素在最后一列，往下走
	        r++;
 	   } else if (r == 0) { // 元素在第一行，往右走
  	      c++;
   	 } else { // 其他情况，往右上走
    	    r--;
    	    c++;
  	  }
	} else {
	    if (r == m - 1) { //元素在最后一行，往右走
 	       c++;
  	  } else if (c == 0) { // //元素在第一列，往下走
    	    r++;
   	 } else { //其他情况，往左下走
   	     r++;
   	     c--;
   	 }
	}
        }
        return result;
    }
}