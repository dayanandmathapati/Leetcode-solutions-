class Solution {
    public int lenLongestFibSubseq(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = nums.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prev = nums[j];
                int cur = nums[i] + nums[j];
                int len = 2;
                while (set.contains(cur)) {
                    int temp = cur;
                    cur = cur + prev;
                    prev = temp;
                    maxLen = Math.max(maxLen, ++len);
                }
            }
        }
        return maxLen;
    }
}