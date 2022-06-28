#for문
a = [(1,2), (3,4), (5,6)]
for (first, last) in a:
  print("(",first,",",last,")")

test_list = ['one', 'two', 'three'] 
for i in test_list: 
  print(i)

marks = [90, 25, 67, 45, 80]

number = 0 
for mark in marks: 
  number = number +1 
  if mark >= 60: 
    print("%d번 학생은 합격입니다." % number)
  else: 
    print("%d번 학생은 불합격입니다." % number)

# 2-dimensional loop
import numpy as np

x = [[1,2,3],
     [4,5,6],
     [7,8,9,10]]

for i in np.arange(len(x)):
  for j in np.arange(len(x[i])):
    print(x[i][j],end=" ")
  print()