# 수 정렬하기 3

# N개의 수가 주어졌을 때, 
# 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

import sys
n = int(input())

arr = [0] * 10001

for i in range(n):
    now = int(sys.stdin.readline().rstrip())
    arr[now] += 1

for i in range(len(arr)):
    if arr[i] != 0:
        for _ in range(arr[i]):
            print(i)

# arr = []
# arr.append(int(input()))
# for i in range(n-1) :
#     now = int(input())
#     changed = False
#     for a in arr:
#         if a >= now:
#             arr.insert(arr.index(a), now)
#             changed = True
#             break
#     if changed == False:
#         arr.append(now)
# print(arr)