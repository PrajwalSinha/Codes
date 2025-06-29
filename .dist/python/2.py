hello = 'hello'.upper()
print(type(hello))
print(hello.lower())
print(hello.capitalize())
print(hello.count('ll'))

#you can add and multiply two strings
x = "hello"
y = 'hello'
print(x!=y)
print('a'>'Z') #True - char is ascii
print('a'>'b') #false

print(7.5>7)
result = 6 ==6
print(result)

#chained conditionals - and or not
x = 7
y = 8
z = 0

result1 = x==y
result2 = y>x
result3 = (z-2)<(x+2)

result4 = result1 or not result2 or result3
print(result4)

