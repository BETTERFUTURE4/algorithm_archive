# 알람 시계

x = input().split()

hour = int(x[0])
minite = int(x[1])

if minite < 45:
    if hour == 0:
        print(23 , minite+15)
    else:
        print(hour-1 , minite+15)

else:
    print(hour, minite - 45)