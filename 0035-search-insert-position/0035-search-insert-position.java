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
}
