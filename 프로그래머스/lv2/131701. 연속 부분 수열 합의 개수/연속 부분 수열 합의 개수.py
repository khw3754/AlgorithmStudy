# 각 1..2..3..개수마다의 부분수열을 구하고 더해서 리스트로 저장
def solution(elements):
    result = elements[::]
    
    # 길이가 2인 부분 수열부터 쭉 탐색
    for length in range(2, len(elements)+1):
        for i in range(len(elements)):
            if i + length < len(elements):
                result.append(sum(elements[i:i+length]))
            else:
                result.append(sum(elements[i:]) + sum(elements[:i+length-len(elements)]))
    
    
    return len(set(result))