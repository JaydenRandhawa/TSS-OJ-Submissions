x = float(input())
z = float(input())
y = float(input())

loops = 0

while x < z:
    x = x*((y/100)+1)
    loops += 1

print(loops)