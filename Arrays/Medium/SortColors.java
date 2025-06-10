public class SortColors{
    public static void sortColors(int[] nums) {
        int[] f = new int[3];
        for(int num : nums){
            f[num]++;
        }
        int i = 0;
        for (int j = 0; j < f.length; j++){
            while (f[j] > 0){
                nums[i++] = j;
                f[j]--;
            }
        }
    }
    public static void main(String args[]){
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) System.out.print(num + " "); // 0 0 1 1 2 2
    }
}