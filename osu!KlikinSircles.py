# not finished

import math

coords = []
distance = 0

circelCount = int(input())

for i in range(circelCount):
    coords.append(input())

for i in range(circelCount-1):
    distance += math.sqrt((int(coords[i].split()[0]) - int(coords[i + 1].split()[0]))^2 + (int(coords[i].split()[1]) - int(coords[i + 1].split()[1]))^2)

print(distance)