public class MissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] ans = new int [2];
        int [] freq = new int [grid.length*grid.length];
        int done = 0;
        for (int[] grid1 : grid) {
            for (int j = 0; j < grid.length; j++) {
                freq[grid1[j] - 1]++;
            }
        }
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid.length; j++){
                if(done == 2){
                    break;
                }
                else if (freq[(i*grid.length)+j] == 2){
                    ans[0] = (i*grid.length)+j+1;
                    done++;
                }
                else if(freq[(i*grid.length)+j] == 0){
                    ans[1] = (i*grid.length)+j+1;
                    done++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] grid = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] ans = findMissingAndRepeatedValues(grid);
        System.out.println("Missing number -> " + ans[1]); // 5
        System.out.println("Repeating number -> " + ans[0]); // 9
    }
}