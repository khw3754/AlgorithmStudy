# 정답을 보고 푼 풀이
def solution(board):
    answer = 0

    for y in range(1, len(board)):
        for x in range(1, len(board[0])):
            if board[y][x] != 0:
                board[y][x] += min(board[y-1][x-1], board[y][x-1], board[y-1][x])
                if answer < board[y][x]:
                    answer = board[y][x]
    
    if answer == 0:
        for y in range(len(board)):
            if board[y][0] == 1:
                answer = 1
                break
        for x in range(len(board[0])):
            if board[0][x] == 1:
                answer = 1
                break

    return answer ** 2