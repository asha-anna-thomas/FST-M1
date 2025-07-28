user1_name = input("Enter player1 name: ")
user2_name = input("Enter player2 name: ")
rock = "rock"
paper = "paper"
scissors = "scissors"

#get the users choice
user1_ans = input(user1_name + " enter your choice from rock, paper, scissor  ")
user2_ans = input(user2_name + " enter your choice from rock, paper, scissor  ")

#logic
if (user1_ans == user2_ans):
    print("Its a tie")
elif(user1_ans == rock) and (user2_ans == paper):
    print(f"{user2_name} wins")
elif(user1_ans == rock) and (user2_ans == scissors):
    print(f"{user1_name} wins")
elif(user1_ans == paper) and (user2_ans == rock):
    print(f"{user1_name} wins")
elif(user1_ans == paper) and (user2_ans == scissors):
    print(f"{user2_name} wins")
elif(user1_ans == scissors) and (user2_ans == paper):
    print(f"{user1_name} wins")
elif(user1_ans == scissors) and (user2_ans == rock):
    print(f"{user2_name} wins")
else:
    print("invalid input")