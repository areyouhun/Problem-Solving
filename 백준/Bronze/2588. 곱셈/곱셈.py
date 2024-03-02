x = int(input())
y = int(input())

third_line = x * (y % 10)
fourth_line = x * ((y // 10) % 10)
fifth_line = x * (y // 100)
sixth_line = third_line + (fourth_line * 10) + (fifth_line * 10**2)

print(third_line)
print(fourth_line)
print(fifth_line)
print(sixth_line)