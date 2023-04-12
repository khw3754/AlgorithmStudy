from collections import deque

def solution(begin, target, words):
    visited = {word : False for word in words}
    q = deque()
    q.append([begin, -1])
    
    while q:
        word, count = q.popleft()
        count += 1
        if word == target:
            return count
        
        for w in words:
            c = 0
            for i in range(len(word)):
                if word[i] != w[i]:
                    c += 1
                if c > 1:
                    break
            if c == 1 and not visited[w]:
                q.append([w, count])
                visited[w] = True
    
    return 0