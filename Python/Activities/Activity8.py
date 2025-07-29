#Given a list of numbers, return True if first and last number of a list is same.
num = input("Enter the list of numbers: ").split(",")

if (int(num[0]) == int(num[-1])):
    print("True")
else:
    print("False")