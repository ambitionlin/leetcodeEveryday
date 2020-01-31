package bean;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class Solution {
    public int[][] updateMatrix(int[][] matrix){
        int m = matrix.length;
        if(m==0){
            return matrix;
        }
        int n = matrix[0].length;
        int[][] newMatrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newMatrix[i][j]=Integer.MAX_VALUE-1000;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    newMatrix[i][j]=0;
                }
                else{
                    if(i>0){
                        newMatrix[i][j]=Math.min(newMatrix[i][j],newMatrix[i-1][j]+1);
                    }
                    if(j>0){
                        newMatrix[i][j]=Math.min(newMatrix[i][j],newMatrix[i][j-1]+1);
                    }
                }
            }
        }
        for(int i=m-1;i>=0;i--){
            for (int j=n-1;j>=0;j--){
                if(i<m-1){
                    newMatrix[i][j]=Math.min(newMatrix[i][j],newMatrix[i+1][j]+1);
                }
                if(j<n-1){
                    newMatrix[i][j]=Math.min(newMatrix[i][j],newMatrix[i][j+1]+1);
                }
            }
        }
        return newMatrix;
    }
}
