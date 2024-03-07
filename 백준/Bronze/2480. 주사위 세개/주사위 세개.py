import copy

numbers = list(map(int, input().split()))
targetNumber = 0
prize = 0

if len(set(numbers)) == 1:
    targetNumber = numbers[0]
    prize = 10000 + (targetNumber * 1000)
elif len(set(numbers)) == 2:
    for i in range(1, 7):
        _numbers = [number for number in numbers if number == i]
        if (len(_numbers) == 2):
            targetNumber = _numbers[0]
            prize = 1000 + (targetNumber * 100)
            break
else:
    targetNumber = max(numbers)
    prize = targetNumber * 100

print(prize)