letters = []
hashes = []
length = int(input())

for i in range(length):
    x = input().split(" ")

    letters.append(x[0])
    hashes.append(x[1])

string = input()
decodedString = ""

while len(string) > 0:
    for i in range(len(letters)):
        if string.startswith(hashes[i]):
            decodedString = decodedString + letters[i]
            string = string[len(hashes[i]):]

print(decodedString)