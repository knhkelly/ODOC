def trapping_rain(buildings):
    total_rain = 0

    for i in range(1, len(buildings)-1):
        left_building = max(buildings[:i])
        right_building = max(buildings[i:])
        rain_height = min(left_building, right_building)
        now_rain = max(0, rain_height-buildings[i])
        total_rain += now_rain
    return total_rain


# 테스트
print(trapping_rain([3, 0, 0, 2, 0, 4]))
print(trapping_rain([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]))
