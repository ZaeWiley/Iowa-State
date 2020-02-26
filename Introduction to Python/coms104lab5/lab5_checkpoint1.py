#Switcheroo

def switcheroo(word):
    switchy = word[-1]+word[1:-1]+word[0]
    return switchy

a = raw_input("Enter a word you would like to switcheroo...")
print switcheroo(a)
