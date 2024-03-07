hour, minute = map(int, input().split())
duration = int(input())

end_time = (hour * 60) + minute + duration

if (end_time >= 1440):
    end_time -= 1440
    
print((end_time // 60), (end_time % 60))