year = int(input())
is_leap_year = ((year % 4 == 0) and (year % 100 != 0)) or (year % 400 == 0)
print('{}'.format(1 if is_leap_year else 0))