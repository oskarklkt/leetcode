class Solution(object):
    def twoSum(self, nums, target):
        diffMap = {}

        for i in range(len(nums)):
            currentDiff = target - nums[i]
            if currentDiff in diffMap:
                return [diffMap[currentDiff], i]
            diffMap[nums[i]] = i
        return None