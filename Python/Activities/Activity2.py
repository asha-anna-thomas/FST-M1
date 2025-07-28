#Ask the user for a number.
num = input("Enter a number : ")

#Depending on what number they enter, tell them if the number is an even or odd number.
if (int(num) % 2 == 0):
    print(f"{num} is an even number")
else:
    print(f"{num} is an odd number")