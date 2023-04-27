n = int(input())
for _ in range(n):
    total_score = 0
    s = input()
    score = 1
    for i in s:
        if i == 'O':
            total_score += score
            score += 1
        else:
            score = 1
    print(total_score)