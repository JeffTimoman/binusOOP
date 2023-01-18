import os
os.system("cls")
class Person:

    #Constructors
    # Constructor is a special method that is called when an object is created from a class, and it allows the class to initialize the attributes of a class.
    def __init__(self, name, age, country):
        self.name = name
        self.age = age
        self.country = country

        # self.name = "John"
        # self.age = 36
        # self.country = "Norway"

    def printName(self):
        print("Hello, my name is " + self.name)

# Create Object
p1 = Person("Carol", 17, "Indonesia")
p1.printName()
