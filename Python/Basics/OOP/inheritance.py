#inheritance

# like "extends"
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
print(my_pet)
print(type(my_pet))
print(f"{my_pet.age}, {my_pet.name}, {my_pet.sound}, {my_pet.type}")
print('-'*100)


# like "implements"
class MyInterface:
  def load_data_source(self) -> str:
    """Load in the file for extracting text."""
    pass

class MyClass(MyInterface):
  def __init__(self) -> None:
    super().__init__()
    print("MyClass")
  
  # def load_data_source(self) -> str:
  #   print("load")
  #   return "asalskdjf"

instan = MyClass()
print(instan)
print(instan.load_data_source())
