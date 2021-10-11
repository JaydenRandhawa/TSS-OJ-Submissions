word = input().rstrip(".")
wordArr = word.split("nt")

if len(wordArr) % 2 == 1:
    print(wordArr[0])

else:
    if wordArr[0] == "yes":
        print("no")
    else:
        print("yes")