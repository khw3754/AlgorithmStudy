from collections import deque

def bfs(map_, m, n, x, y):
    count = 0
    dx = [1, 0]
    dy = [0, 1]
    q = deque()
    q.append([x, y])
    visited = [[False for _ in range(m)] for _ in range(n)]
    visited[y][x] = True
    
    while q:
        x, y = q.popleft()
        for i in range(2):
            n_x, n_y = x + dx[i], y + dy[i]

            if 0 <= n_x < m and 0 <= n_y < n and map_[n_y][n_x] != -1:
                map_[n_y][n_x] += map_[y][x]
                if not visited[n_y][n_x]:
                    q.append([n_x, n_y])
                    visited[n_y][n_x] = True

    


def solution(m, n, puddles):
    map_ = [[0 for _ in range(m)] for _ in range(n)]
    for p in puddles:
        map_[p[1]-1][p[0]-1] = -1
    map_[0][0] = 1
    
    bfs(map_, m, n, 0, 0)
    return map_[-1][-1] % 1_000_000_007