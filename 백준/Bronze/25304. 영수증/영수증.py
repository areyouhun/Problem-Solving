x = int(input())
n = int(input())

actual_total = 0
for i in range(0, n):
    a, b = map(int, input().split())
    actual_total += a * b

print("Yes" if x == actual_total else "No")