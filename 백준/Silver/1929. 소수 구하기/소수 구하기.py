m, n = map(int, input().split())
for target in range(m, n+1):
    for i in range(2, int(target**(1/2)) + 1):
        if target % i == 0:
            break
    else:
        if target != 1:
            print(target)