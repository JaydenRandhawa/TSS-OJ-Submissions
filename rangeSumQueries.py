size = int(input())
nums = input().split(" ")

results = []

queryCount = int(input())

for i in range(queryCount):
    x = input().split(" ")
    y = [int(x[0], int(x[1]))]
    z = 0

    for ii in range(y[1] - y[0]):
        z += int(nums[y[0]-1+ii])

    results.append(z)

print(results)