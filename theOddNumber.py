counts = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

n = int(input())

nums = input().split(" ")

for i in range(n):
    counts[int(nums[i])] += 1

for i in range(len(counts)):
    if counts[i] % 2 == 1:
        print(i)
        break