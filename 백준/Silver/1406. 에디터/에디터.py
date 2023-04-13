import sys
s = sys.stdin.readline().strip()
N = int(sys.stdin.readline())

left = [i for i in s]
right = []

for _ in range(N):
    o = list(sys.stdin.readline().split())
    if o[0] == 'L' and left:
        right.append(left.pop())
    elif o[0] == 'D' and right:
        left.append(right.pop())
    elif o[0] == 'B' and left:
        left.pop()
    elif o[0] == 'P':
        left.append(o[1])

s = ''.join(left) + ''.join(right[::-1])
print(s)