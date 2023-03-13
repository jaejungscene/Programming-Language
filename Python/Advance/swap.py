def swap1(x, y):
  temp = x
  x = y
  y = temp

def swap2(x, y):
  temp = x[0]
  x[0] = y[0]
  y[0] = temp

x = 1
y = 2
print(f"x={x} y={y}")
swap1(x,y)
print(f"x={x} y={y}") # no change

print()

x = [1]
y = [2]
print(f"x={x[0]} y={y[0]}")
swap1(x, y)
print(f"x={x[0]} y={y[0]}") # no change

print()

print(f"x={x[0]} y={y[0]}")
swap2(x, y)
print(f"x={x[0]} y={y[0]}") # change!!