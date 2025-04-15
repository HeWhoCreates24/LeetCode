import java.util.*;
public class NextPermutation{
    public static int[] nextPermutation(int[] nums) {
        int n = nums.length;
        for (int i = n-1; i >= 0; i--){
            if (i > 0 && nums[i-1] < nums[i]){
                i--;
                for (int j = n-1; j >= i; j--){
                    if (nums[j] > nums[i]){
                        nums[i] = nums[i]^nums[j];
                        nums[j] = nums[i]^nums[j];
                        nums[i] = nums[i]^nums[j];
                        i++;
                        j = n-1;
                        while (i < j){
                            nums[i] = nums[i]^nums[j];
                            nums[j] = nums[i]^nums[j];
                            nums[i] = nums[i]^nums[j];
                            i++;
                            j--;
                        }
                        return nums;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(result)); // output: [1, 3, 2]
        nums = new int[]{3, 2, 1};
        result = nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(result)); // output: [1, 2, 3]
    }
}