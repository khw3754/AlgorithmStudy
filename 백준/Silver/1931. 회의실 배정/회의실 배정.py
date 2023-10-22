N = int(input())
meets = [tuple(map(int, input().split())) for _ in range(N)]

meets = sorted(meets, key = lambda x:(x[1], x[0]))
time = max = 0

for meet in meets:
    if meet[0] >= time:
        time = meet[1]
        max += 1
print(max)