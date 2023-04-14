def solution(n):
    count = bin(n)[2:].count('1')
    
    while True:
        n += 1
        bin_ = bin(n)[2:]
        if count == bin_.count('1'):
            return n