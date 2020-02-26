#Script to Run The Matching Pennies Game
#Purpose is to implement, and run game.py's functions with user inputs as well
#Explanation will be done here for neatness
#I import the functions from games.py
#Use display menu to print out the text menu first
#I then use the variable "a" to take in a raw input of the users choice and have it as a string
#Then use the first while loop to play the game under the condition that variable "a" is not equal to "q"
#I use a.lower() in case user used an upper case
#Player 1 and Player 2 are randomly assigned "Heads" or "Tails" and print out what they landed on
#I then implement a second while loop inside the first while loop in the case that they land on two different sides of the penny
#Else if the same if it is side for both users the second while loop breaks and continue to the if else statement
#The if else statement declare the winner
#I then use the "display_menu()" function to re display the text menu
#Take in raw input under the variable "a" again to get users input as a string
#Only use an if statement that breaks the loop if "a" matches the string "q"
#Used a.lower() again in case user used upper case
#If "a" doesnt match "q" then loop continues

from games import place_penny , display_menu

display_menu()

a = raw_input("What would you like to do?")

while a.lower() != "q":
    player1 = place_penny()
    print "Player 1 has landed on", player1
    player2 = place_penny()
    print "Player 2 has landed on", player2
    while player1 != player2:
        print "No one won, the game continues..."
        player1 = place_penny()
        print "Player 1 has landed on", player1
        player2 = place_penny()
        print "Player 2 has landed on", player2
    if player1 == "Heads" and player2 == "Heads":
        print "Player 1 wins"
    else:
        print "Player 2 wins"
                
    display_menu()
    a = raw_input("What would you like to do?")
    if a.lower() == "q":
        print "Hope you had fun playing, Bye!"
        break
        
