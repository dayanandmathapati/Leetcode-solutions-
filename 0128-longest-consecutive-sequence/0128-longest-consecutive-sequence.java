class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int max=0;
        for(int n : set){
            if(!set.contains(n - 1)){
                int count  = 1;
                int current =n;
                while(set.contains(current+1)){
                count++;
                current ++;
            }
            // int max =0;
            if(count > max){
                max  = count;
            }
        }}
        return max;
        
    }
}