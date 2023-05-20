

'''   method !!! overloading !!! is not possible in python    '''

# method overriding
class Parent():
  def __init__(self):
    self.value = 1
  def forward(self, x):
    return self.value + x
 
class Child(Parent):
  def forward(self, x):
    out = super(Child, self).forward(x)
    return out + x

child = Child()
print(child.forward(5))