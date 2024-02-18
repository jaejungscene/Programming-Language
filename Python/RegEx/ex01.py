import re

result = re.match('[0-9]', 'h12lo0a')
print(result)
result = re.match('[0-9]', '120')
print(result)
print("-"*100)


result = re.search('[0-9]', 'hel12lo0a')
print(result)
print("-"*100)


result = re.findall('[^0-9]+', 'hel12lo0a')
print(result)
result = re.split('[0-9]+', 'hel12lo0a')
print(result)
print("-"*100)


result = re.finditer('[0-9]', 'hel12lo0a')
print(next(result))
print(next(result))
print(next(result))


