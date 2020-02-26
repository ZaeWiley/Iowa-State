# Rock Paper Scissors Game designed to let the users play Roshambo
# Both users are randomly selected a hand, and the program is designed to select which user wins
# I will be doing comments describing my code here for organizational purposes
# While I followed the flowchart for the first part I decided to change it just a little for the second part
# Although it says raw input the only input we take from the user is the enter key
# After the enter key is pressed we then randomly select one of the three options for the user credit to the random choice import
# Where I differed from the flowchart is my main chunk of code determining who wins in every situation I felt as if this route was easier for me
# I start with if it is not a tie then one of the users have won, and if one of the users have not won either then my error statement occurs as last resort
# I essentially use the else if statements to say if this and this then user 2 wins else user 1 wins, and after 3 else if statements we hit every option
# Basically saying if it is a tie end code, if it is not a tie user 2 has won,  if it is not a tie and user 2 has not won, then user 1 has won, and if none print error
# Lastly I also added extra code for a while loop that if used will allow the user to play again, but commented it out because that is not what this assignment entails

from random import choice

print "Rock Paper Scissors Game"
print "This is a game of do or die, pray that luck may carry you across"
print "Loading..."

player1 = raw_input("Player 1: Press the ENTER key to reveal your hand...")
player1_hand = choice(["Scissors","Paper","Rock"])
print "Player 1 has chosen: ",player1_hand
player2 = raw_input("Player 2: Press the ENTER key to reveal your hand...")
player2_hand = choice(["Scissors","Paper","Rock"])
print "Player 2 has chosen: ",player2_hand

if player1_hand == player2_hand:
    print "Both players selected",player1_hand + "...Tie! Better luck next time!"
elif player1_hand == "Scissors":
    if player2_hand == "Rock":
        print player2_hand,"Smashes" ,player1_hand, ", Player 2 Wins"
    else:
        print player1_hand,"Beats" ,player2_hand, ", Player 1 Wins"
elif player1_hand == "Rock":
    if player2_hand == "Paper":
        print player2_hand,"Blinds" ,player1_hand, ", Player 2 Wins"
    else:
        print player1_hand,"Beats" ,player2_hand, ", Player 1 Wins"
elif player1_hand == "Paper":
    if player2_hand == "Scissors":
        print player2_hand,"Slice" ,player1_hand, ", Player 2 Wins"
    else:
        print player1_hand,"Beats" ,player2_hand, ", Player 1 Wins"
else:
    print "Error in system please try again!"




#### Extra Code I made using the while loop to allow you to play the game again if you please 
### while True:
###    n = raw_input("Would you like to play again? (yes/no)")
###    if n == "yes":
###        break
###    else:
###        print "Loading..."
##        player1 = raw_input("Player 1: Press the ENTER key to reveal your hand...")
# player1_hand = choice(["Scissors","Paper","Rock"])
# print "Player 1 has chosen: ",player1_hand
# player2 = raw_input("Player 2: Press the ENTER key to reveal your hand...")
# player2_hand = choice(["Scissors","Paper","Rock"])
# print "Player 2 has chosen: ",player2_hand
##
# if player1_hand == player2_hand:
##    print "Both players selected",player1_hand,"... Tie! Better luck next time!"
# elif player1_hand == "Scissors":
##    if player2_hand == "Rock":
##        print player2_hand,"Smashes" ,player1_hand, ", Player 2 Wins"
##    else:
##        print player1_hand,"Beats" ,player2_hand, ", Player 1 Wins"
# elif player1_hand == "Rock":
##    if player2_hand == "Paper":
##        print player2_hand,"Blinds" ,player1_hand, ", Player 2 Wins"
##    else:
##        print player1_hand,"Beats" ,player2_hand, ", Player 1 Wins"
# elif player1_hand == "Paper":
##    if player2_hand == "Scissors":
##        print player2_hand,"Slice" ,player1_hand, ", Player 2 Wins"
##    else:
##        print player1_hand,"Beats" ,player2_hand, ", Player 1 Wins"
# else:
##    print "Error in system please try again!"
    
