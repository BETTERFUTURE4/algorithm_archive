# 1535 안녕

# 사람개수 N, 잃는체력 리스트 L, 기쁨 리스트 J
# 사람들을 픽업해서 고른다
# 첫 방법 : combinations로 가능한 모든 경우의 수 구하고 그중 제일 높은 기쁨

from itertools import combinations

def getArrSum(L, orderArr):
    steminas = [L[e] for e in orderArr]
    return sum(steminas)

N = int(input())
L = list(map(int, input().split()))
J = list(map(int, input().split()))

dic = [i for i in range(N)]

finalDic = []

for i in range(1, N+1):
    finalDic.extend(combinations(dic, i))

joys = []

for d in finalDic:
    if getArrSum(L,d) < 100:
        joys.append(getArrSum(J,d))

if not joys:
    print(0)
else:
    print(max(joys))
