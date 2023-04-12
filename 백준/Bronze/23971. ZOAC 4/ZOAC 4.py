h, w, n, m = map(int, input().split())

count = h // (n+1)
if h % (n+1) != 0:
    count += 1
c = w // (m+1)
if w % (m+1) != 0:
    c += 1
count *= c

print(count)
