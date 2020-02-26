#Script to run and implement functions from hats.py
#Explanation will be done here for neatness
#Its purpose is to import hat.py's functions and implement them to use user input
#I get input for hats since its quantity, and raw input to string the users input
#I used if statement for the conditional "yes" and elif statement for "no" so I could use the else statement in case of an error
#Output takes what the function returns(total) and prints it, and thats important so you dont get that random none

from hats import order_total , order_total_overnight

a = input("How many hats?")
b = raw_input("Would you like overnight shipping?(yes/no)")

if b == "yes":
    print "The total cost of your order is: ", order_total_overnight(a)
elif b == "no":
    print "The total cost of your order is: ", order_total(a)
else:
    print "Error please re-enter information"
