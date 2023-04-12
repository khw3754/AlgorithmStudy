def solution(park, routes):
    answer = []
    
    map_ = []
    pos = []
    # 현재 좌표 파악, S -> O 로 표시
    for i, p in enumerate(park):
        tmp = ""
        for j, s in enumerate(p):
            if s == 'O' or s == 'X':
                tmp += s
            elif s == 'S':
                tmp += 'O'
                pos = [i, j]
        map_.append(tmp)
    
    move = {'E':(0, 1), 'W':(0, -1), 'S':(1, 0), 'N':(-1, 0)}
    h = len(map_)
    w = len(map_[0])
    # 이동
    for route in routes:
        op = list(route.split())
        n = int(op[1])
        op = op[0]
        
        m = move[op]
        
        n_x, n_y = pos[0] + m[0] * n, pos[1] + m[1] * n
        if 0 <= n_x < h and 0 <= n_y < w:
            can_move = True
            for nn in range(1, n+1):
                xx, yy = pos[0] + m[0] * nn, pos[1] + m[1] * nn
                if map_[xx][yy] == 'X':
                    can_move = False
                    break
            if can_move:
                pos = [n_x, n_y]
    
    
    return pos