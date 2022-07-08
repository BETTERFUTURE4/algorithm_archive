# 큰 수 만들기

# 문제 설명
# 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

# 예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 
# 이 중 가장 큰 숫자는 94 입니다.

# 문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. 
# number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

# 제한 조건
# number는 2자리 이상, 1,000,000자리 이하인 숫자입니다.
# k는 1 이상 number의 자릿수 미만인 자연수입니다.
# 입출력 예
# number	k	return
# "1924"	2	"94"
# "1231234"	3	"3234"
# "4177252841"	4	"775841"

# 4177252841
# 12345678
# 87654321

# -------------------

def solution(number, k):
    size = len(number)-k
    list_number = [9] + [int(n) for n in number] + [9]
    count = 0
    start_idx = 1
    while count < k and len(list_number) > size:
        for i in range(start_idx,len(list_number)-1):
            if list_number[i-1] >= list_number[i] and list_number[i+1] > list_number[i]:
                list_number.pop(i)
                count += 1
                start_idx = i-1
                break
        else:
            count += 1
            if list_number[1] >= list_number[len(list_number)-2]:
                list_number.pop(1)
            else:
                list_number.pop(len(list_number)-2)

    result = [str(n) for n in list_number[1:len(list_number)-1]]
    return "".join(result)
    

print("정답:94",solution("1924",2))
print("정답:11",solution("1111",2))
print("정답:31",solution("1131",2))
print("정답:33",solution("3313",2))
print("정답:43",solution("4321",2))
print("정답:2",solution("12",1))
print("정답:1",solution("11",1))
print("정답:3234",solution("1231234",3))
print("정답:775841",solution("4177252841",4))
print("정답:775841",solution("4177252841",4))