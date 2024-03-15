import sys

input = sys.stdin.readline

n, m = map(int, input().split())

baskets = [0] * n
for _ in range(m):
    i, j, k = map(int, input().split())
    for idx in range(i, (j + 1)):
        baskets[idx - 1] = k

print(" ".join(map(str, baskets)))