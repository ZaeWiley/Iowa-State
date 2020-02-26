#Many Hats and Module Functions
#Purpose is to calculate order/cost for hats and normal shipping, or hats and overnight shipping
#Will be doing my code explanation here for neatness
#In the first function "order_total(num)" I used one if else statement kept it basic
#it revolves around the num variable but returns total because I had to modify num and add shipping
#For the total in the first if statement I did num/6 * 50 to get number of hats ordered in 6's and did num%6 to get the amount of singles purchased
#In the second function "order_total_overnight(num)" I kept it almost the same as the first function
#One difference is I used a elif because while I could have done other things since it had multiple conditionals the elif felt cleaner and safer
#Still revolves around num, and returns total but took out the shipping variable because it seemed useless since shipping was simple for that portion

def order_total(num):
    if num >= 6:
        shipping = num*2.00
        total = ((num/6)*50)+((num%6)*10)+shipping
        return total
    else:
        shipping = num*2.00
        total = num*10 + shipping
        return total

def order_total_overnight(num):
    if num > 20:
        total = num*10+(num*3)
        return total
    elif (num<=20) and (num>5):
        total = num*10+45.00
        return total
    else:
        total = num*10+32.00
        return total
