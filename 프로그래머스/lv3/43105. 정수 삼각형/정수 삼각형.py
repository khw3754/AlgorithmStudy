def bot_up(triangle):
    for j, tri in enumerate(triangle[-1::-1]):
        for i in range(len(tri)-1):
            triangle[len(triangle)-2-j][i] += max(tri[i], tri[i+1])
            

def solution(triangle):
    bot_up(triangle)
    
    return triangle[0][0]