def insertion_sort(arr):
    n = len(arr)
    for i in range(n):
        key = arr[i]
        j = i-1
        while j >= 0 and key < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key



list = [2, 5, 9, 1, 4, 90, 64, 32, 12, 55]

insertion_sort(list)
print(list)