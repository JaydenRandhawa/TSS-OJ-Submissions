frames = int(input())

cOrder = input().split()
order = input().split()

pos = order.index(cOrder[0])

if frames - (pos + 1) <= frames/2:
    print(frames - pos)
else:
    print(pos)