inversions = 0
num = int(input())
perm = input()

permArr = perm.split(" ")

for i in range(num):
    if int(permArr[i]) < int(permArr[0]):
        inversions += 1

print(inversions)