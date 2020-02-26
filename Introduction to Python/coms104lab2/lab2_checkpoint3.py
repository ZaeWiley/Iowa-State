# Simple interactive script to determine bill for hotel
name = raw_input("What's your name? ")
print "Customer's full name: ", name
nights = input("How many nights are you staying? ")
print "Number of nights:  ", nights
Totalroomservicecharge = input("How much did room service cost? ")
print "Room service costs for you will be... " , Totalroomservicecharge
Totaltelephonecharge = input("How much did telephone service cost? ")
print "Your telephone bill will be... " , Totaltelephonecharge
print "Calculating..."
print "Calculating..."
print "River bend Hotel Bill Customer: ", name
totalroomcharge = 55*nights
print "Total room charge($): " ,totalroomcharge
entertainmenttax = 16.5
print "Entertainment tax($): " ,entertainmenttax
totalbill = totalroomcharge+Totalroomservicecharge+Totaltelephonecharge+entertainmenttax
print "Total Bill($): " ,totalbill
