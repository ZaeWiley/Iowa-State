# This script computes the total amount for an order of mousetraps
# costing 2.00 each for the first 50, and 1.50 each thereafter

num = input("How many mousetraps? ")
res = raw_input("Are you an Iowa Resident? (yes/no) ")

if num <= 50:
    total = num * 2.00
else:
    first = 50 * 2.00
    extra = (num - 50) * 1.50
    total = first + extra

if res == "yes":
    print "Subtotal: ", total
    print "Tax: ", total*.06
    print "Total:", total+(total*(0.06))

else:
    
    print "Total: ", total

    
