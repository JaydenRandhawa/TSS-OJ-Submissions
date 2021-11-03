cardinality = int(input())
brackets = input()

leftSet = []
rightSet = []

israel = False

for i in range(int(cardinality/2)):
    leftSet.append(brackets[i])
    rightSet.append(brackets[i+int(cardinality/2)])

for i in range(int(cardinality/2)):
    if leftSet[i] != rightSet[i]:
        israel = False
        break
    else:
        israel = True

if israel == True:
    print("YES")
else:
    print("NO")