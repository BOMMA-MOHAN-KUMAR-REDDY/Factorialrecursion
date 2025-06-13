import java.util.Scanner;

public class Main {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;

        for (int i = 0; i < n; i++)
            sum += nums[i];

        if (sum % 2 != 0)
            return false;

        boolean[] dp = new boolean[10001];
        dp[0] = true;
        for (int num : nums) {
            for (int j = 10000; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
            if (dp[sum / 2])
                return true;
        }
        return dp[sum / 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean result = obj.canPartition(nums);
        if (result) {
            System.out.println("The array can be partitioned into two subsets with equal sum.");
        } else {
            System.out.println("The array cannot be partitioned into two subsets with equal sum.");
        }

        scanner.close();
    }
}
