from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = len(nums)
        new_nums = []
        for i in range(l):
            for j in range(i+1,l):
                if((nums[i] + nums[j]) == target):
                    new_nums.append(i)
                    new_nums.append(j)
        return new_nums
        