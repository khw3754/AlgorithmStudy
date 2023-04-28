n = int(input())
words = [input() for _ in range(n)]
words = sorted(list(set(words)), key=lambda x: (len(x), x))
for i in words:
    print(i)