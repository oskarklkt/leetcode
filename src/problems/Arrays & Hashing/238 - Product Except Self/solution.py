class Solution(object):
    def productExceptSelf(self, nums):
        output = [1] * len(nums)
        prefix_product = 1
        suffix_product = 1

        for i in range(len(nums)):
            output[i] *= prefix_product
            prefix_product *= nums[i]

        for i in range(len(nums) - 1, -1, -1):
            output[i] *= suffix_product
            suffix_product *= nums[i]

        return output