#key value pair
x = {'key':4}
x['key2'] = 5
x[2] = [2,1,3,4]
print('key' in x)
print(x['key'])

for key,value in x.items():
  print(key,value)