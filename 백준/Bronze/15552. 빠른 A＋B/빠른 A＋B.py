import sys

t = int(sys.stdin.readline())
results = []

for _ in range(t):
    results.append(sum(map(int, sys.stdin.readline().split())))

for result in results:
    print(result)