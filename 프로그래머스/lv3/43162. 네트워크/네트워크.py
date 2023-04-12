from collections import deque
# bfs로 i부터 탐색하면서 연결된 모든 노드를 방문하는 함수
def bfs(computers, i, visited):
    q = deque()
    q.append(i)
    visited[i] = True
    
    while q:
        link = computers[q.popleft()]
        
        for idx, j in enumerate(link):
            if j == 1 and i != idx and not visited[idx]:
                q.append(idx)
                visited[idx] = True
    
    
def solution(n, computers):
    answer = 0
    
    visited = [False for _ in range(n)]
    for i in range(n):
        if not visited[i]:
            bfs(computers, i, visited)
            answer += 1
    
    return answer