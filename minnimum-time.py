import math


def minSpeedOnTime(dist: list[int], hour: float) -> int:
    speed = 1
    found = False

    while not found:
        time_taken = 0
        count = 0
        for d in dist:
            count += 1
            if(time_taken <= hour):
                if(d != dist[-1]):
                    time_taken += math.ceil(d/speed)
                else:
                    time_taken += d/speed

            else:
                if(count-1 > hour):
                    speed = -1
                    found = True
                break

        if time_taken != 0 and time_taken <= hour:
            found = True
        if not found:
            speed += 1
    return speed


x = minSpeedOnTime([1, 3, 2], 1.9)

print(x)
