T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
    ho = [i for i in range(1, n+1)]
    
    for _ in range(k):
        new_ho = []
        for i in range(n):
            new_ho.append(sum(ho[:i+1]))
        ho = new_ho
    print(ho[-1])