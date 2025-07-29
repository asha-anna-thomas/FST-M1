#Given a tuple of numbers, iterate through it and 
# print only those numbers which are divisible by 5

user_input = input("enter numbers with comma separated: ").split(",")
print(user_input)


nums = tuple(map(int, user_input))
print(nums)


for num in nums:
    if (num % 5 == 0):
        print(num)

