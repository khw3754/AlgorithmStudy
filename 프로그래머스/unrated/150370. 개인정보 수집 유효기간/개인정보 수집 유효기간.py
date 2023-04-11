# 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return
def solution(today, terms, privacies):
    answer = []
    
    # 날짜에서 . 삭제
    today = ''.join(today.split('.'))
    
    terms_ = {}
    # 각 약관의 보관 기간의 날짜를 계산해서 딕셔너리로 저장
    for term in terms:
        term = list(term.split())
        terms_[term[0]] = int(term[1])
        
    
    # 각 개인정보의 보관 최대 기간을 계산    
    for i, pri in enumerate(privacies):
        pri = list(pri.split())
        
        ymd = list(pri[0].split('.'))
        y = int(ymd[0])
        m = int(ymd[1])
        d = ymd[2]
        
        ##### 문제점 : month가 12일때 12 % 12 = 0, 12 // 12 = 1
        ##    해결 : 더해주는 기간 // 12 를 year에 +, 더해주는 기간 % 12 를 month에 + 후 month > 12 체크
        plus = terms_[pri[1]]
        y += plus // 12
        m += plus % 12
        if m > 12:
            y += 1
            m -= 12
        m = str(m) if m > 9 else '0' + str(m)
        
        ymd = str(y) + m + d
        
        print(ymd, today)
        if ymd <= today:
            answer.append(i+1)
        
    
    return answer