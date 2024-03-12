import sys

input = sys.stdin.readline
n = int(input())
numbers = map(int, input().split())
target = int(input())
count = 0

for i in numbers:
    if (i == target):
        count += 1

print(count)