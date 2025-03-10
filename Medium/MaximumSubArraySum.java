public class MaximumSubArraySum{
    public static int maxSubArray(int[] nums) {
        int curr = 0;
        int ans = nums[0];
        for(int num : nums){
            curr = Math.max(num, curr + num);
            if (curr > ans) ans = curr;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // 6
    }
}