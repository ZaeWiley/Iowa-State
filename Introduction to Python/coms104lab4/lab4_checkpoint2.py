#Circle Area & Cylinder Volume

def circle_area(radius):
    result = radius * radius * 3.14
    return result

radius = input("What is the radius of the circle?")
height = input("What is the height of the cylinder?")
volume = circle_area(radius) * height
print "The volume of the cylinder is", volume



