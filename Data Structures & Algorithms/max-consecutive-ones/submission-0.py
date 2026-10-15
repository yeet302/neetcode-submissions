class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxLength = 0
        temp = 0
        for num in nums:
            if num == 1:
                temp += 1
                if maxLength < temp:
                    maxLength = temp
            else:
                temp = 0
        return maxLength