import sys
M = int(sys.stdin.readline())
l = [0 for _ in range(21)]
for _ in range(M):
    inp = list(sys.stdin.readline().split())

    if inp[0] == 'add':
        l[int(inp[1])] = 1
    elif inp[0] == 'remove':
        l[int(inp[1])] = 0
    elif inp[0] == 'check':
        print(l[int(inp[1])])
    elif inp[0] == 'toggle':
        if l[int(inp[1])]:
            l[int(inp[1])] = 0
        else:
            l[int(inp[1])] = 1
    elif inp[0] == 'all':
        l = [1 for _ in range(21)]
    elif inp[0] == 'empty':
        l = [0 for _ in range(21)]