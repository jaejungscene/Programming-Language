#method overloading is not possible in python

#method overriding
class Parent(object):
  def __init__(self):
    self.value = 4
  def get_value(self):
    return self.value
 
class Child(Parent):
  def get_value(self):
    return self.value + 1

child = Child()
print(child.get_value())

#inheritance
class Pet:
  def __init__(self, name, age, sound, type):
    self.name = name
    self.age = age
    self.sound = sound
    self.type = type

class Dog(Pet):
  def __init__(self, name, age):
    super().__init__(name, age, "How How", "Dog")


class Cat(Pet):
  def __init__(self, name, age):
    super().__init__(name, age, "Mewo", "Cat")

my_pet = Pet(name="jae", sound="mwe", age=12, type="cat")
print(type(my_pet))
print(f"{my_pet.age}, {my_pet.name}, {my_pet.sound}, {my_pet.type}")
