"""
This code make the "intensive_task" function executed only once.
So, after executing this python file, 
you will get different time lapse in two print function.
And also you'll get only one "executed" printed.
"""
import time
cached_items = {}

def cached(func):
    def wrapper(*args, **kwargs):
        global cached_item
        if func.__name__ not in cached_items:
            cached_items[func.__name__] = func(*args, **kwargs)
        return cached_items[func.__name__]
    return wrapper

@cached
def intensive_task():
    print("executed")
    time.sleep(1.0)
    return 10

start_time = time.time()
intensive_task()
print("--- %.8fsec first execution ---" % (time.time() - start_time))
start_time = time.time()
intensive_task()
print("--- %.8fsec second execution ---" % (time.time() - start_time))
