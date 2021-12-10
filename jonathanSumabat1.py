terrainTime = []
terrainDist = []

queries = []

terrainCount = int(input())

for i in range(terrainCount):
    x = input().split(" ")
    terrainTime.append(int(x[0]))
    terrainDist.append(int(x[1]))

queriesCount = int(input())

for i in range(queriesCount):
    x = int(input())