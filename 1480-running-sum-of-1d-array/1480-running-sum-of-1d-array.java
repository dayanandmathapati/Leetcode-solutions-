class Solution {
    public int[] runningSum(int[] nums) {
        int[] pref = new int[nums.length];
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum +=nums[i];
            pref[i]=sum;
        }
        return pref;
    }
}