def fibo(n):
    cal = [0, 1]
    
    for i in range(2, n+1):
        cal.append(cal[i-1] + cal[i-2])
    return cal[-1]

def solution(n):
    return fibo(n) % 1234567