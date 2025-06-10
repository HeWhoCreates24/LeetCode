public class ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int max_area = -1;
        while (i < j){
            int min_height = Math.min(height[i], height[j]);
            max_area = Math.max((j-i)*min_height, max_area);
            while (i < j && height[i] <= min_height) i++;
            while (i < j && height[j] <= min_height) j--;
        }
        return max_area;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Water -> " + maxArea(height) + " units"); // Max Water -> 49 units
    }
}