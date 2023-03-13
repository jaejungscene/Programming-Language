import collections

Point = collections.namedtuple("point", ["x", "y"])
print(Point)
p = Point(11,22)
print(p)
print(len(p))
print(type(p))
print(p[0], p[1])

s = "mississippi"
d = collections.Counter(s)
print(dict(d))
print(d)
print(type(d))

