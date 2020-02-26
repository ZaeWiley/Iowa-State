#Random Stuff for checkpoint 3

from math import ceil
from sample_functions import simple_postage, sing_verse

num = input("How many bottles of beer are on the wall?")
weight = input("What is the weight of the letter?")

print  sing_verse(num)
print "and..."
print simple_postage(weight)
