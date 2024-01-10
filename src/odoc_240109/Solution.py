def solution(elements):
    sumList = []
    slice = []
    index = 0
    for i in range(len(elements)):
        for count in range(len(elements)):
            slice.append(elements[index])
            print("slice")
            print(slice)
            index += 1
            # index 값을 추가하지 않는 경우가 있다! 이걸 어떻게 계산하지?
            if(index >= len(elements)):
                index = 0
            if len(slice) == i+1:
                sumList.append(sum(slice))
                slice.clear()


    print("sumList")
    print(sumList)
    answer = len(sumList)
    return answer

result = solution([7,9,1,1,4])
print(result)