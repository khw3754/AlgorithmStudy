from collections import defaultdict
from math import prod

def solution(clothes):
    dict_ = defaultdict(int)
    for i, x in clothes:
        dict_[x] += 1

    vals = list(dict_.values())
    count = prod([v+1 for v in vals]) - 1
    
    return count
