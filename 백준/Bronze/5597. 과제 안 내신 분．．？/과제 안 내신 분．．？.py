import sys

input = sys.stdin.readline
students = [i for i in range(1, 31)]

for i in range(0, 28):
    students.remove(int(input()))

for i in sorted(students):
    print(i)