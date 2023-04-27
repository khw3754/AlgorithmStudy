n = int(input())
count = 0
while n > 0:
    if count == 0:
        n -= 1
    else:
        n -= 6 * count
    count += 1
print(count)