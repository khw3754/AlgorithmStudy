from itertools import permutations as per

def cal(n):
    if n == 1 or n == 0:
        return False
    for i in range(2, int(n**(1/2))+1):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    numbers_ = []
    for i in range(1, len(numbers)+1):
        numbers_.extend(list(per(numbers, i)))
    numbers_ = list(map(lambda x: int(''.join(x)), numbers_))
    numbers_ = list(filter(cal, numbers_))
    
    numbers_ = list(set(numbers_))
    print(numbers_)
    return len(numbers_)