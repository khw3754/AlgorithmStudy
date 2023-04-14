def solution(numbers):
    numbers = list(map(str, numbers))
    numbers = sorted(numbers, key=lambda x: x*3)
    
    result = ''.join(numbers[::-1])
    if result[0] == '0':
        return '0'
    else:
        return result