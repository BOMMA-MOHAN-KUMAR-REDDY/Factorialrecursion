import java.util.*;
public class Main {
    public int findJudge(int N, int[][] trust) {
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Main solution = new Main();

        // Test Case: N = 3, trust = [[1,3],[2,3]]
        int N = 3;
        int[][] trust = { {1, 3}, {2, 3} };

        int judge = solution.findJudge(N, trust);
        System.out.println("The town judge is: " + judge); // Expected: 3
    }
}
