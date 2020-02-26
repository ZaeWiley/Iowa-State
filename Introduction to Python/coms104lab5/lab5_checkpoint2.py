#Username Maker

def findUserName(word):
    listy = word.strip()
    listy1 = listy.split()
    first = listy1[-1]
    last = listy1[0]
    username = first[0]+last[0:-1]
    return username.lower()

a = raw_input("Enter Last name, First name: ")
print "Suggested Username: ", findUserName(a)
