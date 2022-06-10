d = {1:"AAA", 2:"BBB", 3:"CCC", 4:"DDD"}

lst_d = list(d)                 # make a list of dictionary Keys
print(lst_d)
lst_d_values = list(d.values()) # make a list of dictionary Values
print(lst_d_values)

tup_d = tuple(d)                # make a tuple of dictionary Keys
print(tup_d)
tup_d_values = tuple(d.values())# make a tuple of dictionary Values
print(tup_d_values)

set_d = set(d)                # make a set of dictionary Keys
print(set_d)
set_d_values = set(d.values())# make a set of dictionary Values
print(set_d_values)


l = [11,22,33,44,55]
s = {"A","B","C"}
t = (99,88,77,66)

enum_l = enumerate(l)
enum_s = enumerate(s)
enum_t = enumerate(t)

d_enu_l = dict(enum_l)
d_enu_s = dict(enum_s)
d_enu_t = dict(enum_t)

print(d_enu_l)
print(d_enu_s)
print(d_enu_t)