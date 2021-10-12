# not finished

stoneCount = int(input())
stoneHeights = input().split(" ")

cost = 0

currentStone = 0

while currentStone != stoneCount - 1:
    if stoneCount - currentStone > 2:
        if abs(int(stoneHeights[currentStone]) - int(stoneHeights[currentStone + 2])) < abs(int(stoneHeights[currentStone]) - int(stoneHeights[currentStone + 1])):
            cost += abs(int(stoneHeights[currentStone]) - int(stoneHeights[currentStone + 2]))
            currentStone += 2
        else:
            cost += abs(int(stoneHeights[currentStone]) - int(stoneHeights[currentStone + 1]))
            currentStone += 1
    else:
        cost += abs(int(stoneHeights[currentStone]) - int(stoneHeights[currentStone + 1]))
        currentStone += 1

print(cost)