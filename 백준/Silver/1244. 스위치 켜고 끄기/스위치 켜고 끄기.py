switch_count = int(input())
switches = list(map(int, input().split()))
stu_count = int(input())

def maleFunc(num):
    n = num
    num -= 1
    while num < switch_count:
        switches[num] = 1 if switches[num] == 0 else 0
        num += n

def femaleFunc(num):
    num -= 1
    switches[num] = 0 if switches[num] == 1 else 1

    left, right = num - 1, num + 1
    while 0 <= left and right < switch_count and switches[left] == switches[right]:
        switches[left] = 0 if switches[left] == 1 else 1
        switches[right] = 0 if switches[right] == 1 else 1
        left -= 1
        right += 1

func_dict = {1 : maleFunc, 2 : femaleFunc}

for _ in range(stu_count):
    sex, num = map(int, input().split())
    func_dict[sex](num)


# 출력 20개
index = 0
while index < switch_count:
    print(*switches[index:index+20])
    index += 20