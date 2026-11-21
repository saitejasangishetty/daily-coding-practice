public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] nums, int k) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int result = longestSubarray(nums, k);

        System.out.println("Longest subarray length: " + result);
    }
}