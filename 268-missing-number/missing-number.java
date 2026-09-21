class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=0;
        int t=n*(n+1)/2;
        for(int e:nums){
            s+=e;
        }
        return t-s;
    }
}