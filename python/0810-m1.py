# 숫자판 점프

# 문제
# 5×5 크기의 숫자판이 있다. 
# 각각의 칸에는 숫자(digit, 0부터 9까지)가 적혀 있다. 

# 이 숫자판의 임의의 위치에서 시작해서, 
# 인접해 있는 네 방향으로 다섯 번 이동하면서, 
# 각 칸에 적혀있는 숫자를 차례로 붙이면 6자리의 수가 된다. 

# 이동을 할 때에는 한 번 거쳤던 칸을 다시 거쳐도 되며, 
# 0으로 시작하는 000123과 같은 수로 만들 수 있다.

# 숫자판이 주어졌을 때, 
# 만들 수 있는 서로 다른 여섯 자리의 수들의 개수를 구하는 프로그램을 작성하시오.

# 입력
# 다섯 개의 줄에 다섯 개의 정수로 숫자판이 주어진다.

# 출력
# 첫째 줄에 만들 수 있는 수들의 개수를 출력한다.

# 1.가능한 모든 경우의 수 구하기
# - 모든 노드들마다
#     - 가능한 이동경로 구하기...(while문, 메소드화)
#         - 갈수 있는 모든 방향 탐색 후 한칸 이동, while문 다시 돌리기
# 2.중복제외
# 3.갯수 구하기

def getAllRoute(arr, x,y):
    stackArr = [[[x,y], str(arr[y][x])]]
    result = []
    while stackArr:
        node = stackArr.pop()
        if len(node[1]) == 6:
            result.append(node[1])
        else:
            dx = [1,-1,0,0]
            dy = [0,0,1,-1]
            x = node[0][0]
            y = node[0][1]
            for i in range(4):
                xx = x + dx[i]
                yy = y + dy[i]
                if 0 <= xx < 5 and 0 <= yy < 5:
                    stackArr.append([[xx,yy], node[1] + str(arr[yy][xx])])
    return result

arr = [list(map(int, input().split()))for _ in range(5)]

routes = set()
for x in range(5):
    for y in range(5):
        routes = routes.union(getAllRoute(arr, x,y))

print(len(routes))