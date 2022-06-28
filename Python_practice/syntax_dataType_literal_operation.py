#############################################
# Text Type:	      str
# Numeric Types:  	int, float, complex
# Sequence Types:	  list, tuple, range
# Mapping Type:	    dict
# Set Types:	      set, frozenset
# Boolean Type:	    bool
# Binary Types:	    bytes, bytearray, memoryview
#############################################


x = "Hello World"	 #str	
x = 20	#int
x = 20.5	#float	
x = 1j	#complex(복소수: x+yi)
x = [1,2,3,4,5]	 #list	
x = ("apple", "banana", "cherry")	 #tuple(처음 정의하면 그 후로는 값을 바꿀 수 없음)
x = range(6)	#range	
x = {"name" : "John", "vector" : [1,2,3]}	 #dict	
x = {"apple", "banana", "cherry"}	 #set(값을 바꿀 수는 없지만 값을 set에 추가할 수 있음)
x = frozenset({"apple", "banana", "cherry"})	#frozenset	
x = True	#bool	
x = b"Hello"	#bytes
x = bytearray(5)	#bytearray
x = memoryview(bytes(5))  #memoryview

# extra literal
print(123)
print(3.4e3)
print(0o34)
print(0x2a)

#special operation
print('3**2 =',3**2) #3^2 반환
print('7//4 =',7//4) #7/4 = 1.75에서, 몫 1 반환

#None datatype
print(type(None))
print(None)