def findWater(arr):
    n=len(arr)
    left = [0]*n
    right = [0]*n
    water = 0
    left[0] = arr[0]
    for i in range( 1, n):
        left[i] = max(left[i-1], arr[i])
    right[n-1] = arr[n-1]
    for i in range(n-2, -1, -1):
        right[i] = max(right[i+1], arr[i]);
    for i in range(0, n):
        water += min(left[i],right[i]) - arr[i]
 
    return water
print(findWater([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]))
print(findWater([0, 1, 0, 2, 1, 0, 1]))
print(findWater([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]))
print(findWater([0, 1, 0, 2, 1, 0, 5, 1, 0, 2]))
print(findWater([0, 1, 0, 5, 1, 0, 2]))
print(findWater([0, 5, 1, 3, 4, 0, 1]))