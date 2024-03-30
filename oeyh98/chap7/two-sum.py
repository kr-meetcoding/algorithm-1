from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
# O(n^2)
#1693 ms	17.3 MB


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i, n in enumerate(nums):
            complement = target - n

            if complement in nums[i + 1:]:
                return nums.index(n), nums[i + 1:].index(complement) + (i + 1)
# O(2^n)이지만 1번 코드보다 최선, 평균의 상황에서 더 빠름 -> 리스트 슬라이싱
#341 ms	17.3 MB


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}

        for i, num in enumerate(nums):
            dic[num] = i

        for i, num in enumerate(nums):
            complement = target - num

            if complement in dic and i != dic[complement]:
                return i, dic[complement]
# O(1) ~ O(n) 65 ms, 17.8 MB


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}

        for i, num in enumerate(nums):

            complement = target - num

            if complement in dic:
                return i, dic[complement]

            dic[num] = i
#57 ms	17.8 MB