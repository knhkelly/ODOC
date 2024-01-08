def solution(s):
    sSplit = s.split(" ")
    sList = []
    for split in sSplit:
        sList.append(int(split))

    answer = str(min(sList)) + " " + str(max(sList))
    return answer