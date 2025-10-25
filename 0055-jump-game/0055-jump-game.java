class Solution {
    public boolean canJump(int[] nums) {
       int fr =0;
       for(int i=0;i<nums.length;i++){
        if(i>fr){
            return false;
        } 
        fr = Math.max(fr,i+nums[i]);
        if(fr>nums.length-1){
            return true;
        }
       } 
       return true;
    }
}