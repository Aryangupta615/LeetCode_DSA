class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(candidates, target, 0, currentCombination, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        // Base case: if the target is 0, we found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        // Iterate through candidates starting from index 'start'
        for (int i = start; i < candidates.length; i++) {
            // Skip if the number is greater than the remaining target
            if (candidates[i] > target) continue;
            
            // Choose the number
            currentCombination.add(candidates[i]);
            // Recursively call with reduced target (same index i to allow multiple usage of the same number)
            backtrack(candidates, target - candidates[i], i, currentCombination, result);
            // Backtrack (remove the last chosen number)
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}