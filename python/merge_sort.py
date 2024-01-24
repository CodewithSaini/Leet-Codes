import time
def merge_sort(arr):
    n = len(arr)
    mid = n//2
    if n > 1:
        left = arr[:mid]
        right = arr[mid:]
        merge_sort(left)
        merge_sort(right)
        # merging the sorted arrays
        i = 0
        j = 0
        k = 0
        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                arr[k] = left[i]
                i = i+1
            else:
                arr[k] = right[j]
                j = j+1
            k = k+1
        while i < len(left):
            arr[k] = left[i]
            k = k+1
            i = i+1
        while j < len(right):
            arr[k] = right[j]
            k = k+1
            j = j+1



arr = [2, 4, 3, 6, 9, 12, 1, 5, 19, 112, 89, 61, 55, 76, 32, 29, 21, 33, 40, 49, 100, 99, 93]

start = time.time()
merge_sort(arr)
end = time.time()

print(arr)
print("Time: ", end - start)