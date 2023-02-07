#################################################################################
#  List Comprehensions  vs.  map + filter
#
#  Memory
#   List Comprehensions: buffer all computed results
#   Map/Filter: only compute output elements when asked (more memory efficient)
#
#  Speed
#   LCs: no function call overhead. (The call to map or filter comes with
#       extra overhead if you pass a lambda), slightly faster usually
#   Map/Filter: function calls overhead is present, only faster in some cases
#################################################################################

# map func
def addition(n):
    return n + n
  
# We double all numbers using map()
numbers = (1, 2, 3, 4)
result = map(addition, numbers)
for r in result:
    print(r)
print()

result = map(addition, numbers)
print(list(result))
print("="*50)
###############################################

# filter
def func(x):
    return x>0

number_list = range(-5, 5) # -5~4
# print([i for i in number_list])

result = filter(func, number_list)
for r in result:
    print(r)

result = filter(func, number_list)
print()
print(list(result))

# Output: [-5, -4, -3, -2, -1]