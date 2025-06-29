#range - 3 input - start,stop,step - -by default stop
for i in range(10):
  print(i)

x = [3,4,42,3,2,4]

for i in range(len(x)):
  print(x[i])

#enumerate
for i, element in enumerate(x):
  print(i,element)