# 문자열 반복

# 알파벳 대소문자로 된 단어가 주어지면,
# 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.

# 단, 대문자와 소문자를 구분하지 않는다.
n = int(input())
for i in range(n):
    num, arr = input().split()
    for s in arr:
        print(s * int(num), end="")
    print()
