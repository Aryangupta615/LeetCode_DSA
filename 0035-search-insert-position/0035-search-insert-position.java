class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search loop
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Move the left pointer
            } else {
                right = mid - 1; // Move the right pointer
            }
        }

        // Target not found; return the insertion position
        return left;
    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();

    //     // Example 1
    //     int[] nums1 = {1, 3, 5, 6};
    //     int target1 = 5;
    //     System.out.println("Output: " + solution.searchInsert(nums1, target1)); // Output: 2

    //     // Example 2
    //     int[] nums2 = {1, 3, 5, 6};
    //     int target2 = 2;
    //     System.out.println("Output: " + solution.searchInsert(nums2, target2)); // Output: 1

    //     // Example 3
    //     int[] nums3 = {1, 3, 5, 6};
    //     int target3 = 7;
    //     System.out.println("Output: " + solution.searchInsert(nums3, target3)); // Output: 4
    // }
}
