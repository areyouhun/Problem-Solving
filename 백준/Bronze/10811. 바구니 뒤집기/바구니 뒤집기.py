import sys

input = sys.stdin.readline
n, m = map(int, input().split())
baskets = [i for i in range(1, (n + 1))]

for _ in range(0, m):
    i, j = map(int, input().split())
    baskets = baskets[:(i - 1)] + list(reversed(baskets[(i - 1): j])) + baskets[j:]

print(" ".join(map(str, baskets)))