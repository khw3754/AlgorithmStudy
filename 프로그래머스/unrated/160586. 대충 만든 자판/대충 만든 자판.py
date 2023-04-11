def solution(keymap, targets):
    answer = []
    # 입력 가능한 모든 글자를 딕셔너리에 저장
    keys = {}
    for key in keymap:
        for i, keyy in enumerate(key):
            k = keys.get(keyy, -1)
            if k == -1:
                keys[keyy] = i+1
            elif k > i+1:
                keys[keyy] = i+1

    # 카운트 함
    for target in targets:
        print(target)
        count = 0
        for t in target:
            c = keys.get(t, -1)
            if c == -1:
                count = -1
                break
            count += c
        answer.append(count)
                
    
    return answer