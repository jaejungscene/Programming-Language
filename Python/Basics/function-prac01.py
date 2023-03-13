def Func(x, integer=12, boolean=False):
  print("x is",x)
  print("integer is",integer)
  print("boolean is",boolean)

Func(10)
Func(10, integer=9)
Func(10, integer=7, boolean=True)


def add(*b):
    result=0
    for i in b:
         result=result+i
    return result

print (add(1,2,3,4,5))  # Output:15
print (add(10,20))  # Output:30

print("-"*50)
def fn(**a):
  print(a)
  print(type(a))
  for i in a.items():
    print (i)
    print(type(i))
fn(numbers=5,colors="blue",fruits="apple")
args = {"number":5, "colors":"blue", "fruits":"apple"}
fn(**args)
# Output:
# ('numbers', 5)
# ('colors', 'blue')
# ('fruits', 'apple')