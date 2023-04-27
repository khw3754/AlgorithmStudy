a = int(input())
b = int(input())
c = int(input())
x = str(a*b*c)

result = []
for i in range(10):
    result.append(x.count(str(i)))
    
for i in result:
    print(i)