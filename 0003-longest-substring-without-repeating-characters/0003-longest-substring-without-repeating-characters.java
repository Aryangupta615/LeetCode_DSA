
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        // Sliding window technique
        for (int right = 0; right < n; right++) {
            // If character is already in the set, shrink the window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "abcabcbb";
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s1)); // Output: 3

        // Example 2
        String s2 = "bbbbb";
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s2)); // Output: 1

        // Example 3
        String s3 = "pwwkew";
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
