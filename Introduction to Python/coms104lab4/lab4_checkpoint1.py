#Even or Odd

#The Call
name = raw_input("What's your name? ")

def even_or_odd(name):
    if len(name)%2 == 0:
        print name,"is Even"
    else:
        print name,"is Odd"

even_or_odd(name)


