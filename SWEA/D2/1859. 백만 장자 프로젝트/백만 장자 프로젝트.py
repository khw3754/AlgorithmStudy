T = int(input())

prices = []
for i in range(T):
    result = 0
    N = int(input())
    prices = list(map(int, input().split()))

    maxPrice = 0
    for index in range(N - 1, -1, -1):
        if prices[index] > maxPrice:
            maxPrice = prices[index]
        else:
            result += maxPrice - prices[index]

    print('#' + str(i+1) + ' ' + str(result))