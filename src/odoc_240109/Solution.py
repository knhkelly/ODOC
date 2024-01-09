def sum(elements):
    elLeng = len(elements)
    if elLeng == 0:
        return 0
    elif elLeng == 1:
        return elements[0]
    return sum(elements[:len(elements)-1]) + elements[-1]

def solution(elements):
    sumList = []
    for i in range(len(elements)):
        slice = elements[0:i]
        sumList.append(sum(slice))
    print(sumList)
    answer = 0
    return answer

solution([7,9,1,1,4])