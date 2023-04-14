from collections import deque

def solution(maps):
    w, h = len(maps[0]), len(maps)
    visited = [[False for _ in range(w)] for _ in range(h)]
    
    q = deque()
    q.append([0, 0])
    visited[0][0] = True
    
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    
    find_goal = False
    
    while q:
        x, y = q.popleft()
        if (x, y) == (h-1, w-1):
            find_goal = True
            break
        
        for i in range(4):
            n_x, n_y = x + dx[i], y + dy[i]
            if 0 <= n_x < h and 0 <= n_y < w and maps[n_x][n_y] == 1 and not visited[n_x][n_y]:
                maps[n_x][n_y] += maps[x][y]
                q.append([n_x, n_y])
                visited[n_x][n_y] = True
                
    if find_goal:
        return maps[-1][-1]
    else:
        return -1