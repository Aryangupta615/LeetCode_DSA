class Solution {
    int helper(int l,int r,String s){
        int cnt =0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            cnt+=1;
            l--;
            r++;
        }
        return cnt;
    }
    public int countSubstrings(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int l=i;
            int r=i;
            ans += helper(l,r,s);
            l=i;
            r=i+1;
            ans += helper(l,r,s);
        }
        return ans;
    }
}