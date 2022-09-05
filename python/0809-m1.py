# 창고 다각형

# N 개의 막대 기둥이 일렬로 세워져 있다. 기둥들의 폭은 모두 1 m이며 높이는 다를 수 있다. 이 기둥들을 이용하여 양철로 된 창고를 제작하려고 한다. 창고에는 모든 기둥이 들어간다. 이 창고의 지붕을 다음과 같이 만든다.

# 지붕은 수평 부분과 수직 부분으로 구성되며, 모두 연결되어야 한다.
# 지붕의 수평 부분은 반드시 어떤 기둥의 윗면과 닿아야 한다.
# 지붕의 수직 부분은 반드시 어떤 기둥의 옆면과 닿아야 한다.
# 지붕의 가장자리는 땅에 닿아야 한다.
# 비가 올 때 물이 고이지 않도록 지붕의 어떤 부분도 오목하게 들어간 부분이 없어야 한다.
# 그림 1은 창고를 옆에서 본 모습을 그린 것이다. 
# 이 그림에서 굵은 선으로 표시된 부분이 지붕에 해당되고, 
# 지붕과 땅으로 둘러싸인 다각형이 창고를 옆에서 본 모습이다. 
# 이 다각형을 창고 다각형이라고 하자.



# 그림1 . 기둥과 지붕(굵은 선)의 예

# 창고 주인은 창고 다각형의 면적이 가장 작은 창고를 만들기를 원한다. 
# 그림 1에서 창고 다각형의 면적은 98 ㎡이고, 이 경우가 가장 작은 창고 다각형이다.

# 기둥들의 위치와 높이가 주어질 때, 
# 가장 작은 창고 다각형의 면적을 구하는 프로그램을 작성하시오.

def getSize(arr):
    maxIdx = sorted(arr, key=lambda arr: arr[0]).pop()[0]
    highstIdx = sorted(arr, key=lambda arr: arr[1]).pop()[0]

    matrix = [[0,0] for _ in range(1001)]
    for a in arr:
        matrix[a[0]] = a

    result = 0
    
    maxCheck = 0
    for i in range(0, highstIdx):
        maxCheck = max(maxCheck, matrix[i][1])
        result += maxCheck

    maxCheck = 0
    for i in range(maxIdx, highstIdx, -1):
        maxCheck = max(maxCheck, matrix[i][1])
        result += maxCheck

    result += matrix[highstIdx][1]
    return result

N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
arr.sort(key=lambda arr: arr[0])

result = getSize(arr)

print(result)
