# Function, and script to implement function with users input
# Purpose is to calculate, and decide whether "x" is a plus perfect number
# A plus perfect number is a number thats still the same even when each digit is powered to the numbers length and added together such as 371 or 1 
# Explanation will be done here for neatness
# The "is_plus_perfect(n)" function's purpose is to take each digit individually, and powers it to the digits length as a string and add them together
# The s variable turns n into a string, and then turns it into int getting the length with "len()"
# Digits turns n into a string, but now instead of getting the length we use "list()" to get each digit in the string as its own section
# Now we have the length, and each digit as its own string making it easier for the iteration process
# I use the in range function because that was the most effective one in this case and it uses variable "i" to iterate as long as its in range
# Now that the digits variable has each digit as its own string I use "len()" on digits and set that as the range because now its iterating each digit in the list
# Sum is originally set to "0" but as it keeps iterating I use sum to add the old sum plus the iterated digit and convert it to an int for safety and power "i" to s which is the length of the number
# I use sum = sum + int(digits[i])**s instead of sum += int(digits[i])**s because I felt it made it easier for me to understand the code later when reviewing
# Finally for the function I end it with and if else statement under the condition "if sum == n" return the line else return the other line
# Lastly we implement the function and take a users input under the variable "a" and if "a" is positive print "Number",a, is_plus_perfect(a) revolving "a" instead of "n"
# Else if it is negative it print an error statement in the case of it being negative

def is_plus_perfect(n):
    s = len(str(n))
    digits = list(str(n))
    sum = 0
    for i in range(len(digits)):
        sum = sum + int(digits[i])**s
    if (sum == n):
        return "is a plus perfect number!"
    else:
        return "is not a plus perfect number."

a = input("Enter a number...")

if a >= 0:
    print "Number", a, is_plus_perfect(a)
else:
    print "Error! Please enter a positive integer"
