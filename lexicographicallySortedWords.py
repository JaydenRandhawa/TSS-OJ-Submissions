words = []
wordCount = int(input())

for i in range(wordCount):
    words.append(input())

wordsSorted = sorted(words)

for i in range(wordCount):
    print(wordsSorted[i])