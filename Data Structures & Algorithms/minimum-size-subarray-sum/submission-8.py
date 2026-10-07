class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        current = 0
        left = 0
        length = 0
        shortest = len(nums)

        for right in range(len(nums)):
            current += nums[right]
            
            while current >= target:
                length = right - left + 1
                shortest = length if length < shortest else shortest

                current -= nums[left]
                left += 1
            

        return 0 if sum(nums) < target else shortest