public class LongestSubstringWithoutRepeat{
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0, right = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            for(int i = left; i < right; i++){
                if(s.charAt(i)==ch){
                    left = i+1;
                    break;
                }
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str)); // 3
    }
}