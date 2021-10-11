num1 = int(input())
num2 = int(input())

while num2 !=0:
    x = num1 % num2
    num1 = num2
    num2 = x

print(num1)