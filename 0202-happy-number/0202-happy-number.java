class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> hm = new HashSet<>();
       while(n!=1 && !hm.contains(n)){
        hm.add(n);
        n=sumofsquare(n);
       }
       if(n==1){
        return true;
       }
       return false;
    }
    public int sumofsquare(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum = sum + digit*digit;
            n=n/10;
        }
        return sum;
    }
}