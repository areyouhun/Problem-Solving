rows = int(input())

for i in range(rows):
    for k in reversed(range(rows)):
        print(" " if i < k else "*", end='')
    print()