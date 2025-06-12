import java.util.HashMap;

class Main {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, maxLen = 0;
        int n = s.length();

        while (r < n) {
            char c = s.charAt(r);

            if (map.containsKey(c)) {
                // Move left pointer to the right of last occurrence of current char if needed
                l = Math.max(l, map.get(c) + 1);
            }

            // Calculate window length and update max
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);

            // Update last seen index of current char
            map.put(c, r);

            r++;
        }
        return maxLen;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        Main solution = new Main();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));  // Output: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));     // Output: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));    // Output: 3
    }
}
