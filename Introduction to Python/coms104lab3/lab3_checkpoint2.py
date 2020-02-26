#postage calculation

from math import ceil
weight = input("Please enter the weight of the letter in ounces: ")

if weight > 3.5:
    cost = 0.88+ceil(weight-1.00)*0.17
    print cost
elif weight > 1.00:
        cost = 0.44 + ceil(weight-1.00)*0.17
        print cost
else:
        cost=0.44
        print cost
        
