import sys

input = sys.stdin.readline
num_of_tests = int(input())
scores = list(map(int, input().split()))

print((sum(scores) / max(scores) * 100) / len(scores))