a, b, v = map(int, input().split())
cal = int((v-b) / (a-b)) + 1 if (v-b) / (a-b) != int((v-b) / (a-b)) else int((v-b) / (a-b))
print(cal)