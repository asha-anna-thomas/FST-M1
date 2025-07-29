#Given a two list of numbers create a new list such that new list 
# should contain only odd numbers 
# from the first list and even numbers from the second list.
num1 = [6, 7, 8, 9]
num2 = [2, 3, 4, 5]

num3 =[]

for num in num1:
    if num % 2 != 0:
        num3.append(num)

for num in num2:
    if num % 2 == 0:
        num3.append(num)

print(num3)