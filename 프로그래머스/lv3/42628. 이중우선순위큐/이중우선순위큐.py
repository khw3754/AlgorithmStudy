from collections import deque

def solution(operations):
    answer = []
    q = deque()
    
    for oper in operations:
        o = list(oper.split())
        n = int(o[1])
        o = o[0]
        
        if o == 'I':
            q.append(n)
        elif len(q) != 0:
            if n == -1:
                q.popleft()
            else:
                q.pop()
        
        q = deque(sorted(q))
    
    if len(q) == 0:
        return [0, 0]
    
    return [max(q), min(q)]