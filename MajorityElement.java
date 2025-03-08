public class MajorityElement{
    public static int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] == major) count++;
            else count--;
            if(count < 0){
                count = 1;
                major = nums[i];
            }
        }
        return major;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element -> " + majorityElement(nums)); // 2
    }
}