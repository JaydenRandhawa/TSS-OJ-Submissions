# exceeds time limit on some problems

params = input().split
conveyor = input()
hashbrown = input()
hashbrowns = 0

while len(conveyor) >= len(hashbrown):
    if conveyor.startswith(hashbrown):
        hashbrowns += 1
    conveyor = conveyor[1:]

print(hashbrowns)