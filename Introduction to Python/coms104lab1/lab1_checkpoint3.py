amount = 67
print "Amount: ", amount

print "Quarters in 67 cents"
quarters = amount/25
amount = amount%25
print "Quarters: ",quarters ," and", amount, "left over..."

print "Dimes in 67 cents"
dimes = amount/10
amount = amount%10
print "Dimes: ",dimes," and", amount, "left over..."

print "Nickels in 67 cents"
nickels = amount/5
amount = amount%5
print "Nickels: ",nickels ," and", amount, "left over..."

print "Pennies in 67 cents"
pennies = amount/1
amount = amount%1
print "Pennies: ",pennies ," and", amount, "left over..."
