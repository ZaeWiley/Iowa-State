#Colfax Industries Shipping Boxes Calculator
#Program used to determine shipping, and its cost 
#In order to keep code organized I will keep all my comments up here
#I used input for quantity and perBox variables to get the users input
#I then used boxes variable to determine how many boxes I will need and the partial variable to determine if the remainder would be zero or not
#It printed out the users input then if partial was equal to zero it printed the normal output
#while if it was not equal to zero it printed out number of boxes plus 1 to account for the left over, and yes to partially filled box
#Lastly if user does not enter a correct input or code crashes it prints out an error statement

quantity = input("How Many Items do you want shipped?")
perBox = input("How many items are there per box?")
boxes = quantity/perBox
partial = quantity%perBox

print "Calculating..."
print "Colfax Industries Shipping Boxes Calculator"
print "Items Quantity: ", quantity
print "Quantity Per Box: ", perBox

if partial == 0:
     print "Required number of boxes: ", boxes
     print "Partially filled box: No"
elif partial != 0:
        print "Required number of boxes: ", boxes+1
        print "Partially filled box: Yes"
else:
    print "Error please try again!"
        
