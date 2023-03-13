class Dog:
    def __init__(self, name) -> None:
        self.name = name


dog1 = Dog("white")


try:
    print(getattr(dog1, "name"))
    dog1._add1 = "hello world"
    print(getattr(dog1, "_add1"))
except Exception as e:
    print("------- Error occurs ------")
    print(e)
    print("---------------------------")
else:
    print("no error ^^")
finally:
    print("this part is executed unconditionally")


print("@@@@"*10)


try:
    setattr(dog1, "_add2", "setadd2") 
    print(getattr(dog1, "_add2"))
except Exception as e:
    print("------- Error occurs ------")
    print(e)
    print("---------------------------")
else:
    print("no error ^^")
finally:
    print("this part is executed unconditionally")


print("@@@@"*10)


try:
    print(getattr(dog1, "_adde"))
except Exception as e:
    print("------- Error occurs ------")
    print(e)
    print("---------------------------")
else:
    print("no error ^^")
finally:
    print("this part is executed unconditionally")