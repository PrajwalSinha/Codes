#functions
def func(x,y):
  print('Run ',x,y)
  return x*y, x/y #return in tuple


r1, r2 = func(5,6)
print(r1,r2)

#lambda - one line anonyms function
x = lambda x,y: x+y
print(x(2,32))

#fsgtrings
tim = 89
x = f'hello {6+8} {tim}'