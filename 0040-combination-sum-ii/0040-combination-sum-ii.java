import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Step 1: Sort to handle duplicates
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int remain, int start) {
        if (remain < 0) return;       // Sum exceeded target
        if (remain == 0) {            // Found valid combination
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // Step 2: Skip duplicates at the same recursion depth
            if (i > start && nums[i] == nums[i - 1]) continue;

            temp.add(nums[i]); // Choose current element
            backtrack(result, temp, nums, remain - nums[i], i + 1); // Move to next index
            temp.remove(temp.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(sol.combinationSum2(candidates, target));
    }
}
