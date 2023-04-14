def solution(s):
    m = list(map(int, s.split()))
    
    st = str(min(m)) + " " + str(max(m))
    return st