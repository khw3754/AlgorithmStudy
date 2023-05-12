from collections import deque
n, m = map(int, input().split())
map = []
for _ in range(n):
    tmp = []
    s = input()
    for c in s:
        tmp.append(int(c))
    map.append(tmp)

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

q = deque()
q.append((0, 0))

while q:
    x, y = q.popleft()

    for i in range(4):
        n_x, n_y = x + dx[i], y + dy[i]
        if 0 <= n_x < n and 0 <= n_y < m and map[n_x][n_y] == 1:
            map[n_x][n_y] += map[x][y]
            q.append((n_x, n_y))

print(map[-1][-1])