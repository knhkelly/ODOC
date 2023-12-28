def solution(n):
    answer = 0
    n_str = str(n)
    n_list = []

    for each_n in n_str:
        n_list.append(each_n)
    n_list.sort(reverse=True)

    n_str = ""
    for each_n in n_list:
        n_str += each_n
    answer = int(n_str)
    return answer
