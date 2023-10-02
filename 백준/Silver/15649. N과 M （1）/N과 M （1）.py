N, M = map(int, input().split())

nums = [i for i in range(1, N+1)]

def dfs(nums, list):
    if len(list) == M:
        print(*list)
        return

    for i in range(len(nums)):
        copiedList = list[::]
        copiedNums = nums[::]
        n = copiedNums.pop(i)
        copiedList.append(n)
        dfs(copiedNums, copiedList)

dfs(nums, [])