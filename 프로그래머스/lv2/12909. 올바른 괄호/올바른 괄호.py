def solution(s):
    stack = []
    for i in s:
        if i == '(':
            stack.append(1)
        elif stack:
            stack.pop()
        # ')'가 들어왔는데 stack이 비어있으면
        else:
            return False
    
    if stack:
        return False

    return True