num = input()
sum = 0

while len(num) > 1:
    for i in range(len(num)):
        sum += int(num[i])
        
    num = str(sum)
    sum = 0

print(num)