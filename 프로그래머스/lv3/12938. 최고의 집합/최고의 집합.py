def solution(n, s):
    answer = []
    
    # 만들 수 없으면 [-1] 반환
    if s // n == 0:
        return [-1]
    # 계속해서 1/n 한 수를 넣으면 최고의 집합이 나옴
    for _ in range(n):
        answer.append(s // n)
        s -= s // n
        n -= 1
    
    return answer