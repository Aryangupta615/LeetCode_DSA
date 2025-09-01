class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the second half of the number
        while (x > 0) {
            int digit = x % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Build the reversed number
            x /= 10;  // Remove the last digit from the original number
        }

        // Compare the reversed number with the original number
        return original == reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int x1 = 121;
        System.out.println("Output: " + solution.isPalindrome(x1)); // Output: true

        // Example 2
        int x2 = -121;
        System.out.println("Output: " + solution.isPalindrome(x2)); // Output: false

        // Example 3
        int x3 = 10;
        System.out.println("Output: " + solution.isPalindrome(x3)); // Output: false
    }
}

