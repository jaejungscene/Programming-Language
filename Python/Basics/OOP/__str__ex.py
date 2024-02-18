class Ex01:
    def __init__(self, name, age):
        self.public_member = name     # Public Attribute
        self.age = age
m1 = Ex01("SKAUL05", 12)
print(m1)


class Ex02:
    def __init__(self, name, age):
        self.public_member = name     # Public Attribute
        self.age = age
    def __str__(self) -> str:
        return f"{super().__str__()} name={self.public_member}, age={self.age}"
m2 = Ex02("HELLO", 32)
print(m2)