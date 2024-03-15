import sys

input = sys.stdin.readline
n, x = map(int, input().split())
numbers = map(int, input().split())
results = []

for i in numbers:
    if (x > i):
        results.append(i)

for i in results:
    print(i, end = ' ')