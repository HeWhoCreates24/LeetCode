public class SetMatrixZeros{
    public static int[][] setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    for(int k = 0; k < m; k++){
                        if(matrix[i][k] != 0){
                            matrix[i][k] = -69;
                        }
                    }
                    for(int k = 0; k < n; k++){
                        if(matrix[k][j] != 0){
                            matrix[k][j] = -69;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == -69){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int [][] result = setZeroes(matrix);

        for(int[] row : result){
            for(int cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        // 1 0 1
        // 0 0 0
        // 1 0 1
    }
}