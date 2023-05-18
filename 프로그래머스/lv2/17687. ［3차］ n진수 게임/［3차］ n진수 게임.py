# num을 n진법으로 반환
def div(n, num):
    result = ''
    if num == 0:
        return '0'
    
    d = {10:'A', 11:'B', 12:'C', 13:'D', 14:'E', 15:'F'}
    while num != 0:
        if num % n < 10:
            result += str(num % n)
        else:
            result += d[num%n]
        num //= n
    return result[::-1]

def solution(n, t, m, p):
    answer = ''
    
    count = 0
    turn = 1
    while len(answer) < t:
        target = div(n, count)
        
        for s in target:
            if len(answer) >= t:
                break
            
            if turn == p:
                answer += s
            turn += 1
            if turn > m:
                turn = 1
        
        count += 1
    
    return answer








# def solution(n, t, m, p):
#     answer = ''
    
#     count = 0
#     pre_turn = 0
#     while len(answer) < t:
#         target = div(n, count)
#         cycle = 0
        
#         my_turn = p-1 - pre_turn if pre_turn < p else p-1 + m - pre_turn
#         while target[my_turn:my_turn+1] and len(answer) < t:
#             answer += target[my_turn]
#             cycle += 1
#             my_turn += m
        
#         count += 1
#         pre_turn = (len(target) - pre_turn) % m
    
#     return answer






