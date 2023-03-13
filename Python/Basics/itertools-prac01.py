import itertools

for i in itertools.product("ABCD", "ABCD"):
    print(i)
print()

for i in itertools.permutations("ABCD", 2):
    print(i)
print()
for i in itertools.permutations("ABCD", 3):
    print(i)
print()


for i in itertools.combinations("ABCD", 2):
    print(i)
print()
for i in itertools.combinations("ABCD", 3):
    print(i)
print()

print(len([i for i in itertools.combinations("ABCD", 3)]))

# print([i for i in itertools.cycle("12")])
