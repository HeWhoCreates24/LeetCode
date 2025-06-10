import java.util.*;

public class MergeIntervals{
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        int low = intervals[0][0];
        int high = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] <= high) {
                high = Math.max(high, curr[1]);
            } else {
                merged.add(new int[]{low, high});
                low = curr[0];
                high = curr[1];
            }
        }
        merged.add(new int[]{low, high});

        return merged.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);

        for(int[] arr : merged){
            System.out.print("[");
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.print("] ");
        }
        // output : [1 6 ] [8 10 ] [15 18 ] 
    }
}