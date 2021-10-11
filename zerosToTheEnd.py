numArr = []
num = input()
newNum = ""
zeroCount = 0

numArr.append(num.split("0"))

for i in range(len(num)):
    if num[i] != "0":
        newNum = newNum + num[i]
    else:
        zeroCount += 1

for i in range(zeroCount):
    newNum = newNum + "0"
    
print(newNum)