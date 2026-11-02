class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        nums.sort()
        count = 0
        median = nums[len(nums)//2]
        for i in range (len(nums)):
            count +=abs(nums[i] -median)
        return count
        