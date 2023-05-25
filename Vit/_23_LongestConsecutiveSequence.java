import java.util.Arrays;

public class _23_LongestConsecutiveSequence {
    public static int longestConsecutiveSequenceLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;
        System.out.print("Sorted Array: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    System.out.println(longestStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5,6};
        int longestLength = longestConsecutiveSequenceLength(nums);
        System.out.println("Length of the longest consecutive sequence: " + longestLength);
    }
}