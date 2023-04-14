def solution(n):
    answer = 1   # 자기 자신 추가
    
    # n / 2 까지 반복   ---   n/2부터는 조합으로 만들 수 없기 때문
    for i in range(1, n//2 + 1):
        goal = n
        # i 부터 순차적으로 더해봄
        for j in range(i, n):
            goal -= j
            if goal == 0:
                answer += 1
            elif goal < 0:
                break
        
    return answer