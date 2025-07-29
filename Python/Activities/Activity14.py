#Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.
count = int(input("how many fibonnaci numbers to be generated ? "))

a=0
b=1

for i in range(count):
    print(a)
    temp = a
    a = b
    b = temp  + b
    