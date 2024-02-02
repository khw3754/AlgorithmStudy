import sys
input = sys.stdin.readline

N = int(input())
books = [0] * (N + 1)

for day in range(N):
    Ti, Pi = map(int, input().split())
    if Ti != 1 and books[day] > books[day + 1]:
        books[day + 1] = books[day]
    if day + Ti > N:
        continue

    if books[day] + Pi > books[day + Ti]:
        books[day + Ti] = books[day] + Pi

print(books[-1])