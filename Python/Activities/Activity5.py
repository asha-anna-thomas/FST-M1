#Write a Python program to create the multiplication table (from 1 to 10) of a number.
num = input("Enter a number whose multiplication table is required: ")

for x in range(1, 11):
    print(f"{int(num)} * {x} = {int(num)*x}" )
