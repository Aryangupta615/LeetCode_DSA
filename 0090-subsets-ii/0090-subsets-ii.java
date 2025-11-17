class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultlist = new ArrayList<>();
        backtrack(resultlist,new ArrayList<>(),nums,0);
        return resultlist;
    }
    private void backtrack(List<List<Integer>> resultlist,List<Integer> tempset,int[] nums,int start ){
        if(resultlist.contains(tempset)){
            return ;
        }
        resultlist.add(new ArrayList<>(tempset));
        for(int i=start;i<nums.length;i++){
            tempset.add(nums[i]);
            backtrack(resultlist,tempset,nums,i+1);
            tempset.remove(tempset.size()-1);
        }
    }
}