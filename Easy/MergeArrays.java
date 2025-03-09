public class MergeArrays{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i >= 0 && j >= 0){
            if (nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        while (k >= 0){
            if (i >= 0){
                nums1[k--] = nums1[i--];
            }
            if (j >= 0){
                nums1[k--] = nums2[j--];
            }
        }

        // ------------------ code finishes here -----------------

        for (i = 0; i < m+n; i++){
            System.out.print(nums1[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n); // 1 2 3 4 5 6
    }
}