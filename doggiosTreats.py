n = int(input())
a = input().split(" ")
for i in range(len(a)):
    if int(a[i]) != int(a[0])*(i+1):
        print(i, int(a[0])*(i+1))