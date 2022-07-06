# 한조서열정리하고옴ㅋㅋ

# 문제
# 봉우리의 용들이 오른쪽으로 이동... 낮은 봉우리만 먹는다
# 최고의 많은 봉우리를 먹는 용이 먹는 봉우리 수는???

# 입력
# 첫째 줄에 봉우리의 수 겸 활잡이의 수 N이 주어진다. 
# (1 ≤ N ≤ 30,000) 둘째 줄에 N개 봉우리의 높이가 왼쪽 봉우리부터 순서대로 주어진다. 
# (1 ≤ 높이 ≤ 100,000) 각각 봉우리의 높이는 중복 없이 유일하다.

# 출력
# 최고의 활잡이가 처치할 수 있는 적의 최대 숫자를 출력한다.




# import sys

# N = int(input())
# arr = list(map(int, sys.stdin.readline().split()))

# maxCount = 0
# count = 0
# maxQQ = arr.pop(0)
# if not arr:
#     print(0)
# else:
#     for t in arr:
#         if maxQQ > t:
#             count += 1
#         else:
#             maxCount = max(maxCount, count)
#             maxQQ = t
#             count = 0
#         print(t,"maxQQ:", maxQQ,count,"/max : ",maxCount)  
#     print(maxCount)