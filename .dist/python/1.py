print('hello world!')
print(4.5)
print('4.5','hello',end='\n')

#variables
hello = 'tim'
print(hello)

world = 'world'
world = hello
hello = 'no'
print(hello,world)

#input
name = input('Name: ')
print(name)

age = input('Age: ')
print('hello',name,'you are',age,'years old')

#arithmetic operators - both should be same data type
x = 9
y = 3
result = int(x / y)
print(result)

num = input('Number: ') #by default - str in input
print(int(num)-5)
