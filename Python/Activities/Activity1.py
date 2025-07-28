#Write a program that asks the user to enter their name and their age
name = input("Enter your name: ")
age = input("Enter your age: ")

#Print out a message addressed to them that tells them the year that 
# they will turn 100 years old.

birth_year = 2025 - int(age)
birth_year = birth_year + 100
print(f"Hi {name}, you will turn 100 years in {birth_year}")

