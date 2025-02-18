class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums2 = sorted(nums)
        l = len(nums)
        for i in range(1,l):
            if (nums2[i] == nums2[i-1]):
                return True
        return False
         