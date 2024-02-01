public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = 1;
            }
        }
        for (int i=m-2; i>-1; i--){
            for(int j=n-2; j>-1; j--){
                matrix[i][j] = matrix[i+1][j] + matrix[i][j+1];
            }
        }
        return matrix[0][0];
    }
}
