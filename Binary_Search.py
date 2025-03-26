def binary_search(nums, target):
        low = 0
        high = len(nums)-1

        while low <= high:
            mid = (low + high)//2
            guess = nums[mid]
            if target == guess:
                return mid
            if guess > target:
                high = mid - 1
            else:
                low = mid + 1
        return None

my_list = [-1,0,3,5,9,12]
print(binary_search(my_list,5))
print(binary_search(my_list,-1))
print(binary_search(my_list,4))