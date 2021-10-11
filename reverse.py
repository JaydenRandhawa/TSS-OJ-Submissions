cases = int(input())
results = []

for i in range(cases):
    size = int(input())
    dataSet = input().split(" ")

    string = ""

    for ii in range(size):
        string = string + " " + dataSet[size-(ii+1)]
    
    results.append(string.strip())

for i in range(len(results)):
    print(results[i])