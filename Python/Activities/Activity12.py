#Write a recursive function to calculate the sum of numbers from 0 to 10

def sum(n):
    if n <=1 :
        return n
    else:
        return n + sum(n-1)


num =int(input("enter a number : "))
print(sum(num))