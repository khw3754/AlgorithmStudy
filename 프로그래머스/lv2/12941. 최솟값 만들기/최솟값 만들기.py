def solution(A,B):
    answer = 0

    A = sorted(A)
    B = sorted(B)
    
    for i in A:
        answer += i * B.pop()

    return answer