#Write a function sum() such that it can accept a list of elements and print the sum of all elements
def sum(num):
    total = 0
    for n in num:
        total += n
    print("sum is : ", total)

my_list = [5, 10, 15, 20]
sum(my_list)