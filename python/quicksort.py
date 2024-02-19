import random
def partition(arr, low, high):
    pivot_index = random.randint(low, high)
    pivot = arr[pivot_index] # Choosing pivot randomly
    swap(arr, pivot_index, high)
    i = low
    j = high
    while i < j:
        while arr[i] <= pivot and i < j:
            i += 1
        while arr[j] >= pivot and i < j:
            j -= 1
        swap(arr, i, j)
    swap(arr, i, high)
    return i


def quick_sort(arr, low, high):
    if low >= high:
        return
    index = partition(arr, low, high)
    quick_sort(arr, low, index-1)
    quick_sort(arr, index +1, high)



def swap(arr, i, j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp




numbers = [2, 1, 8, 5, 4, 9, 12, 99, 34, 56, 74]
quick_sort(numbers, 0, len(numbers)-1)

print(numbers)