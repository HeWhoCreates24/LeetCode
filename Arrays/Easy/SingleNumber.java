public class SingleNumber{
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums){
            ans = ans^num;
        }
        System.gc(); // run garbage collector for reduced space complexity
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number -> " + singleNumber(nums)); // 4
    }
}