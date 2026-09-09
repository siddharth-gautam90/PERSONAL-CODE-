#Normal way
def add(a, b):
  return a+b
print(add(4,5)),  output  = 9

#Using lamda function
add1 = lambda x,y: x+y
print(add1(4,6)), output  = 10

#Code for find max of the two num
def max(a,b):
  if a>b:
    return  a
  else:
    return b
print(max(4,24)), output  = 24

#using lamda function
mx = lambda x,y: x if x>y else y
print(mx(4, 6)), output  = 6

#function to return given num even or odd
def check(n):
  if n%2== 0:
    return "even"
  else:
    return "odd"
print(check(60)), output  = even
print(check(67)), output  = odd

# using lambda function 
check1= lambda n: "Even" if n%2==0 else "odd"
print(check1(65))
print(check1(8))

# using lambda fun return the last character to the given string
ch = lambda x: x[-1]
print(ch("Siddharth")), output  = h

# code to return the product of 3 numbers 
product = lambda x,y,z: x*y*z
print(product(2, 3, 4)), output  = 24

# map(function, iterable)--> it returns a map object
def cube(lst):
  cb=[]
  for n in lst:
    cb.append(n**3)
  return cb
print(cube([2, 3, 4]))

#using map function
lst = [6, 5, 4]
cub = list(map(lambda x: x**3, lst))
print(cub)

# second mehod 
cub = list(map(lambda x: x**3,  [8, 9, 10]))
print(cub)
#direct classmethod
print(list(map(lambda x: x**3,  [12, 34, 2])))

# code for plus 5 in every number 
plus = lambda x: x+5
print(plus(2))
 #second method
lst = [5, 56, 43]
plus5 = list(map(lambda x: x+5, lst))
print(plus5) 
#third method
print(list(map(lambda x: x+5, [4, 49, 466])))

# list of string convert into uppercase
s = ["Aditya", "Kunal","Rahul"]
ups = []
for elem in s:
  ups.append(elem.upper())
print(ups)

# using lambda 
s = ["Aditya", "Kunal","Rahul"]
upp = list(map(lambda s: s.upper(), s))
print(upp)

# list of prices, rturn a new list with 18% gst included prices
# prices = [40, 300, 200]
# gst_p = list(map(lambda x: 1.18*x, prices))
# print(gst_p)

# file handaling
#syantex
file = open("sample.txt", "w")
file.write("Rahul\n")
file.write("Kunal\n")
file.write("Anuj\n")
file.close()

file = open("sample.txt", "r")
data = file.read()
print(data)
file.close()

file = open("sample.txt", "r")
for line in file:
  print(line,end = " ")
file.close
#r --> read mode
#w --> write
#a ---> append

print(" ")

file = open("sample.txt", "a")
file.write("\nAditya")
file.close()
#readline - this code read line by line code in given file 
print(" ")
file = open("sample.txt", "r")
data = file.read()
print(data)
file.close()

# x --> to create a new file 
file = open("abc.txt", "x")
file.close()
print(" Second method to print file , and this is more standard way of file handling and there is no need close the file -----> ")
print(" ")
#  
with open("sample.txt", "r") as file:
  print(file.read() + " ")
  
# add another file 

with open("demo.txt", "w") as file:
  file.write("\nHimanchal")
with open("demo.txt", "a") as file:
  file.write("\nSiddharth")
with open("demo.txt", "r") as file:
  print(file.read())

#CSV FILE ---> male it table format
import csv 
with open ("student.csv", "w", newline = "") as file:
  writer = csv.writer(file)
  writer.writerow(["Name", "Marks", "City"])
  writer.writerow(["Anuj", 90, "Aligarh"])
  writer.writerow(["Siddharh", 85, "Aligarh"])
  
# code for read file content form csv and print it 
with open("student.csv", "r") as file:
  reader = csv.reader(file)
  for row in reader:
    print(row)
  
# new record name , marks , city 
name = input("Enter name: ")
marks = int(input("Enter Marks: "))
city = input("Enter City: ")
