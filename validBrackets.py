cardinality = int(input())
brackets = input()

types = [0, 0, 0, 0, 0, 0]

for i in range(cardinality):
    if brackets[i] == "(":
        types[0] += 1
    elif brackets[i] == ")":
        types[1] += 1
    elif brackets[i] == "[":
        types[2] += 1
    elif brackets[i] == "]":
        types[3] += 1
    elif brackets[i] == "{":
        types[4] += 1
    elif brackets[i] == "}":
        types[5] += 1

if types[0] == types[1] and types[2] == types[3] and types[4] == types[5]:
    print("YES")
else:
    print("NO")