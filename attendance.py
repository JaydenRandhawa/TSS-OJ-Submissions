presences = ["0"]
presencesOut = []
count = int(input())

for i in range(count):
    presences.append(input())

reqs = int(input())

for i in range(reqs):
    presencesOut.append(presences[int(input())])

for i in range(len(presencesOut)):
    if presencesOut[i] == "yes":
        print("here")
    else:
        print("not here")