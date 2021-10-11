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
    y = 0
    print(terrainTime[y])
    while x - terrainTime[y] > 0:
        x -= terrainTime[y] * terrainDist[y]
        y += 1
        if y > len(terrainTime) - 1:
            y -= 1
    z = x/terrainTime[y]

    print(x, "," ,z)