ca = int(input())
cd = int(input())

sc = input().split(" ")
bscArr = input().split(" ")

scArr = [int(bscArr[0]) - int(sc[0]), int(bscArr[1]) - int(sc[1])]

if scArr[0] < scArr[1]:
    cost = scArr[0]*cd + (scArr[1]-scArr[0])*ca
else:
    cost = scArr[1]*cd + (scArr[0]-scArr[1])*ca

print(abs(cost))