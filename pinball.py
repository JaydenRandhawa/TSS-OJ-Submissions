results = []
scores = []
games = int(input())

for i in range(games):
    scores.append(int(input()))

for i in range(len(scores)):
    score = 0
    for ii in range(i):
        if scores[ii] < scores[i]:
            score += 1
        results.append(score)

print(results)