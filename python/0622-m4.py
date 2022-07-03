# 단어 공부

# 알파벳 대소문자로 된 단어가 주어지면, 
# 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 

# 단, 대문자와 소문자를 구분하지 않는다.
from string import ascii_uppercase
alphabet_list = list(ascii_uppercase)

arr = [0 for i in range(len(alphabet_list))]
strs = input()

for a in strs:
    for n in range(len(alphabet_list)):
        if a.upper() == alphabet_list[n]:
            arr[n] += 1

arrmax = max(arr)
if arr.count(arrmax) > 1:
    print("?")
else:
    print(alphabet_list[arr.index(arrmax)])