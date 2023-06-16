def solution(order):
    answer = 0
    
    stack = []
    belt = [i for i in range(1, len(order)+1)][::-1]
    stack_check = [0] * (len(order)+1)
    
    for i in range(len(order)):
        if stack_check[order[i]] == 1:
            if stack[-1] != order[i]:
                break
            else:
                stack.pop()
                answer += 1
        else:
            while belt[-1] != order[i]:
                tmp = belt.pop()
                stack.append(tmp)
                stack_check[tmp] = 1
            belt.pop()
            answer += 1
    
    return answer