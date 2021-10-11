reps = int(input())
ans = []
for i in range(reps):
    ab = input()
    abarr = ab.split(" ")
    ans.append(int(abarr[0]) + int(abarr[1]))

for i in range(len(ans)):
    print(ans[i])