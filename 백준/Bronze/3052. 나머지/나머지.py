import sys

input = sys.stdin.readline
remainders = []

for i in range(0, 10):
    number = int(input())
    remainders.append(number % 42)

print(len(set(remainders)))