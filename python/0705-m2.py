# 한조서열정리하고옴ㅋㅋ

# 입력
# 첫째 줄에 N, M, B가 주어진다. (1 ≤ M, N ≤ 500, 0 ≤ B ≤ 6.4 × 107)

# 둘째 줄부터 N개의 줄에 각각 M개의 정수로 땅의 높이가 주어진다. 
# (i + 2)번째 줄의 (j + 1)번째 수는 좌표 (i, j)에서의 땅의 높이를 나타낸다. 
# 땅의 높이는 256보다 작거나 같은 자연수 또는 0이다.

# 출력
# 첫째 줄에 땅을 고르는 데 걸리는 시간과 땅의 높이를 출력하시오. 
# 답이 여러 개 있다면 그중에서 땅의 높이가 가장 높은 것을 출력하시오.
# -------------------

import sys
import math

def 블럭개수계산(arr,n):
    plusCount = sum([a*(i-n) for i, a in enumerate(arr) if i > n])
    minusCount = sum([a*(n-i) for i, a in enumerate(arr) if i < n])
    return (minusCount, plusCount)

N,M,B = map(int, input().split())
arr = list()
for _ in range(N):
    arr.extend(list(map(int,sys.stdin.readline().split())))

땅높이 = 0
시간 = 6.4 * (10**7) * 2 + 1

numArr = [arr.count(n) for n in range(max(arr)+1)]

for n in range(min(arr), int((math.ceil(sum(arr)+B)/(N*M)))+1):
    부족, 잉여 = 블럭개수계산(numArr, n)
    현재시간 = 잉여*2+부족
    if 시간 < 현재시간:
        break
    땅높이 = n
    시간 = 현재시간

print(시간, 땅높이)
