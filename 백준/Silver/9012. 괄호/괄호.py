n = int(input())
for _ in range(n):
    stack = []
    s = input()
    for i in s:
        if i == '(':
            stack.append(i)
        elif stack:
            if stack.pop() != '(':
                print('NO')
                break
        else:
            print('NO')
            break
    else:
        if stack:
            print('NO')
        else:
            print('YES')