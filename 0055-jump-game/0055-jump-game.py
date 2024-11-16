class Solution(object):
    def canJump(self, nums):
        f = 0
        for i in range(len(nums)):
            if i > f: 
                return False
            f = max(f, i + nums[i])  
            if f >= len(nums) - 1:  
                return True
        return False 