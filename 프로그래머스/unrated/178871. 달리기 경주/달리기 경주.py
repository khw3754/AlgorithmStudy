def solution(players, callings):
    # 현재 랭킹 딕셔너리로 등록
    rank = {name:i+1 for i, name in enumerate(players)}
    
    for call in callings:
        r = rank[call]
        rank[call] -= 1
        players[r-1], players[r-2] = players[r-2], players[r-1]
        rank[players[r-1]] += 1
    
    return players