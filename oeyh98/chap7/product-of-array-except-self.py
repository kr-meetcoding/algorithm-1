def productExceptSelf(self, nums: List[int]) -> List[int]:
    left = []
    right = []

    p = 1
    for i in range(len(nums)):
        left.append(p)
        p *= nums[i]

    p = 1
    rnums = nums[::-1]
    for i in range(len(nums)):
        right.append(p)
        p *= rnums[i]
    right = right[::-1]

    return [a * b for a, b in zip(left, right)]