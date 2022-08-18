class Modifiers:

   def __init__(self, name, access):
      if access == 'public':
         self.public_member = name     # Public Attribute
      elif access == 'protected':
         self._protected_member = name # Protected Attribute
      elif access == 'private':
         self.__private_member = name  # Private Attribute


m = Modifiers("SKAUL05", 'public')
print('public :',m.public_member)

m = Modifiers("SKAUL05", 'protected')
print('protected :',m._protected_member)

m = Modifiers("SKAUL05", 'private')
print('private :',m.__private_member)  # error!!!!!