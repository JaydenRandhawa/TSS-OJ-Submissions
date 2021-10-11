b = int(input())
d = int(input())
i = int(input())
n = int(input())

price = 0

price += int(n/13)*b
n = n % 13

price += int(n/12)*d
n = n % 12

price += n*i

print(price)