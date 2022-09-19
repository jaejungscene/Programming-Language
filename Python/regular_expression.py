# https://www.w3schools.com/python/python_regex.asp

import re

# txt = "The rain in Spain"
# # x = re.search("^The.*Spain$", txt)
# x = re.search(r"\bS\w+", txt)
# print(x.group())
# print(x.span())
# print(x.string)
# if x:
#     print("yes")
# else:
#     print("no")



# txt = "hello planet"

# x = re.findall("he.{2}o", txt)
# print(x)

# x = re.findall("he.o", txt)
# print(x)

# x = re.findall("he..o", txt)
# print(x)



# txt = "hehehe"
# x = re.search("h e*", txt)
# if x:
#     print("Yes")
# else:
#     print("no")



# import re

# txt = "The rain in Spain"

# #Check if the string ends with "Spain":

# x = re.findall(r"\bThe", txt) # \b는 escape seqence이기 때문에 \b를 넣은 것이다.

# print(x)

# if x:
#   print("Yes, there is a match!")
# else:
#   print("No match")




# import re

# txt = "8 times bef++ore 11:45 AM"

# #Check if the string has any characters from a to z lower case, and A to Z upper case:

# # x = re.findall("[a-zA-Z]", txt)
# x = re.findall("[+]", txt)

# print(x)

# if x:
#   print("Yes, there is at least one match!")
# else:
#   print("No match")





# import re

# txt = "The rain in Spain"
# x = re.search(" ", txt)

# print("The first white-space character is located in position:", x.start())




# import re

# txt = "The rain in Spain"
# x = re.split("\s", txt, 1)
# print(x)




import re

txt = "The rain in Spain"
x = re.search(r"\wn\b", txt)
print(x.group())

txt = "The rain in Spain"
x = re.findall(r"\w+n\b", txt)
print(x)