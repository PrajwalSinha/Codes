x = input('Name: ')

if x=='Tim':
  print('You are great!')
elif x=='Joe':
  print('Bye Joe')
elif x == 'Sarah':
  print('random')


print('Always do this')



#collection - list and tuples
x = [4,True,'hi']
#list - ordered , changable
print(len(x))
x.append('hello')
print(x)
x.extend([4,5,5,5,5])
print(x)
x.pop() #remove the last element
print(x)
x.pop(0)
print(x)
print(x[1])
x[0] = 'hello'
print(x)
#list - mutable


#tuples
y = (0,0,2,2) #cannot append - inmutable
print(x[0])
