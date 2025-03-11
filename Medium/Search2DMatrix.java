public class Search2DMatrix{
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = 0;
        while (i < matrix.length && j < matrix[i].length){
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] < target) {
                if (j < matrix[i].length-1) j++;
                else{
                    i++;
                    j = 0;
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target)); // true
    }
}