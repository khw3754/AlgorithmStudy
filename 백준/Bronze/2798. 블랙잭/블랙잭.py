from itertools import combinations as combi

n, m = map(int, input().split())
cards = list(map(int, input().split()))
max_ = 0
for card in combi(cards, 3):
    mm = sum(card)
    if mm <= m and max_ < mm:
        max_ = mm
print(max_)