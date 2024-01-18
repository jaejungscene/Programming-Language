

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

  def product(self, a, b):
    p = a * b
    print(p)
    return p
  
  def product(self, *args):
    p = 1
    for a in args:
      p *= a
    print(p)
    return p
  

child = Child()
print(child.forward(5))
print(child.product(1,2.2))