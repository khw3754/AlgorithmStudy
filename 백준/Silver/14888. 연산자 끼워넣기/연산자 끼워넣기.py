N = int(input())
nums = list(map(int, input().split()))
counts = list(map(int, input().split()))
def plus(a, b):
    return a + b
def minus(a, b):
    return a - b
def prod(a, b):
    return a * b
def sub(a, b):
    if a >= 0:
        return a // b
    else:
        return -(-a // b)
operators = [plus, minus, prod, sub]

max = None
min = None
def dfs(nums, counts):
    global max, min
    if len(nums) == 2:
        result = operators[counts.index(1)](nums[0], nums[1])
        if max == None or max < result:
            max = result
        if min == None or min > result:
            min = result
        return

    for i in range(4):
        if counts[i] > 0:
            copiedNums, copiedCounts = nums[::], counts[::]
            copiedNums[1] = operators[i](copiedNums[0], copiedNums[1])
            copiedNums.pop(0)
            copiedCounts[i] -= 1
            dfs(copiedNums, copiedCounts)

dfs(nums, counts)
print(max, min)