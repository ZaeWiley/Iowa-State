#Functions for Matching Pennies Game
#Purpose of these functions is to return "Heads" or "Tails" and print 3 lines for a "Menu"
#Explanation will be done here for neatness
#I import randint from random and implement it into the "place_penny()" function
#The "place_penny()" function makes "r" the rand int within (1,10)
#Then I use the condition "if r%2 == 0" to determine whether it is even
#Else if not even then it returns "Tails" for odd
#Lastly the display menu function is pretty basic and just prints out 3 lines for a text menu

from random import randint

def place_penny():
    r = randint(1,10)
    if (r%2)==0:
        return "Heads"
    else:
        return "Tails"

def display_menu():
    print "### MENU ###"
    print "P) To play the matching penny game"
    print "Q) To quit"
