letters = []
hashes = []
length = int(input())

for i in range(length):
    x = input().split(" ")

    letters.append(x[0])
    hashes.append(x[1])

string = input()
encodedString = ""

for i in range(len(string)):
    encodedString = encodedString + hashes[letters.index(string[i])]
print(encodedString)