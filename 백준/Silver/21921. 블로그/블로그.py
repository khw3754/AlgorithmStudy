N, X = map(int, input().split())
l = list(map(int, input().split()))


max_ = sum(l[:X])
start = 0
sum_ = max_
count = 1
for i in l[X:]:
    n_max = sum_ - l[start] + i
    sum_ = n_max
    start += 1

    if max_ < n_max:
        max_ = n_max
        count = 1
    elif max_ == n_max:
        count += 1

if max_ == 0:
    print('SAD')
else:
    print(max_)
    print(count)
