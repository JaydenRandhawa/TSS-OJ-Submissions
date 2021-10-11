cost = int(input())
age = int(input())
taxRate = float(input())

if age >= 65:
    if cost > 100:
        print("{:.2f}".format(cost*0.9*(taxRate+1)))
    else:
        print("{:.2f}".format(cost*0.9*(taxRate+1)+5))
else:
    if cost > 100:
        print("{:.2f}".format(cost*(taxRate+1)))
    else:
        print("{:.2f}".format(cost*(taxRate+1)+5))