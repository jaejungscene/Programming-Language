def logger(function):
    def wrapper(*args, **kwargs):
        """wrapper doc"""
        print(f"---- {function.__name__}: start ----")
        output = function(*args, **kwargs)
        print(f"---- {function.__name__}: end ----")
        return output
    return wrapper

@logger
def some_func(x, y=1):
    """some_func doc"""
    print("start: some_func()")
    return x+y
    
print(some_func(41))
print(some_func.__name__)
print(some_func.__doc__)
print("="*60)


########################################################################
"""
'wraps' function in functools
"""
from functools import wraps
# print(getattr(some_func, "__name__"))
# setattr(some_func, "__name__", "some_func")
# print(getattr(some_func, "__name__"))

def logger(function):
    @wraps(function)
    def wrapper(*args, **kwargs):
        """wrapper doc"""
        print(f"---- {function.__name__}: start ----")
        output = function(*args, **kwargs)
        print(f"---- {function.__name__}: end ----")
        return output
    return wrapper

@logger
def some_func(x, y=1):
    """some_func doc"""
    print("start: some_func()")
    return x+y

print(some_func(41))
print(some_func.__name__)
print(some_func.__doc__)


########################################################################
"""
'lru_cache' function in functools
"""
import collections
some_func._cache = collections.OrderedDict()
print(some_func._cache)