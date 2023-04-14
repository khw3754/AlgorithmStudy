def solution(s):
    answer = [0, 0]
    
    tmp = 0
    while s != '1' and tmp < 5:
        answer[1] += s.count('0')
        s = s.replace('0', '')
        s = bin(len(s))[2:]
        answer[0] += 1
        tmp += 1
    
    return answer