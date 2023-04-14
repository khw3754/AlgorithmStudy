def solution(s):
    answer = ''
    
    l = list(s.split(' '))
    
    for k in l:
        if k == '': 
            answer += ' '
            continue
        
        if k[0].isalpha() :
            answer += k[0].upper()
        else:
            answer += k[0]

        for i in k[1:]:
            answer += i.lower()
        
        answer += ' '
    
    return answer[:-1]