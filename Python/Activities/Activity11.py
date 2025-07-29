#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

fruit_shop = {
    "mango" : 10,
    "peach" : 15,
    "grapes" : 54,
    "kiwi" : 100,
    "pineapple" : 75
}

fruit = input("which fruit to check for : ")

if (fruit in fruit_shop):
    print("Available")
else:
    print("Not available")