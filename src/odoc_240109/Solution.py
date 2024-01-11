def solution(elements):
    sumList = []
    slice = []
    index = 0
    for i in range(len(elements)):
        for count in range(len(elements)):
            if(count + index >= len(elements)):
                index -= len(elements)
            slice.append(elements[count+index])
            sumList.append(sum(slice))
            if(len(slice)==len(elements)):
                slice.clear()
        index += 1

    sumList = list(set(sumList))
    answer = len(sumList)
    return answer

result = solution([7,9,1,1,4])
print(result)