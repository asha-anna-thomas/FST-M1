#Write a Python program to calculate the sum of all the elements in a list.
num = input("Enter the list of numbers: "). split(",")
print(num)

sum = 0

for number in num:
    sum = sum + int(number)

print(sum)