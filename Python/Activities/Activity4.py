user1_name = input("Enter player1 name: ")
user2_name = input("Enter player2 name: ")
rock = "rock"
paper = "paper"
scissors = "scissors"

while True:
    #get the users choice
    user1_ans = input(user1_name + " enter your choice from rock, paper, scissors  ")
    user2_ans = input(user2_name + " enter your choice from rock, paper, scissors  ")

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

    #repeat logic
    repeat = input("do you want to play again ? ")
    if (repeat =='yes'):
        pass
    elif(repeat =='no'):
        raise SystemExit
    else:
        print("invalid input, exiting")
        raise SystemExit