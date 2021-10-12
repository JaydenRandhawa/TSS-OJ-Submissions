# not finished

students = [0, 0, 0, 0, 0]
studentCount = int(input())

votes = input().split(" ")

for i in range(len(votes)):
    students[int(votes[i]) - 1] += 1

for i in range(studentCount):
    print(students[i])