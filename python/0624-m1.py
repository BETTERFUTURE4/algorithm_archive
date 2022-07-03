def solution(n):
    arr = []
    
    while True:
        arr.append(n % 3)
        n = n // 3
        if(n ==0):
            break
    arr.reverse()
    arr = [str(i) for i in arr]
    print(arr)
    return int("".join(arr), 3)

print(solution(125))