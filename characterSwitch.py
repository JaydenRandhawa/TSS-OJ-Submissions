word = input()
firstChar = word[0]
lastChar = word[-1]
word = word[1:]
word = word[:-1]
print(lastChar + word + firstChar)