import numpy as np


bonus  = 10
marks = np.array([2, 4, 5, 6])
new_marks = marks + bonus
print(new_marks)


a = [3, 5, 7, 2, 4]
b = []
for i in a :
    b.append ( i * 2)
print(b)

# twice of number 
a_np = np.array(a)
b_np = a_np * 5
print(b_np)


# Creating 2d numpy arr
a  = [[2, 4, 5], [4, 6, 7], [ 4, 6, 8]]  
print(a)
b = np.array(a)
print(b)
 
 
c1 = np.zeros(6)
print(a)

c1 = np.zeros((4, 3))
print(c1)

c2 = np.ones(3)
print(c2)

c2 = np.ones((3, 4))
print(c2)

#  print 0 to n-1 number
c3 = np.arange( 6) 
print(c3)

#  like as range in python concept
c3 = np.arange(1, 11)
print(c3)

# even number 
c3 = np.arange(2, 11 , 2)
print(c3)
# odd number 
c3 = np.arange(1, 11 , 2)
print(c3)

# Month of 31 days 
c3 = np.arange(1, 32)
print(c3)

# linspace -- 0 se 10 tak ki range ko 5 equal parts me divide krega 
c4 = np.linspace(0, 10, 5)
print(c4) # [ 0.   2.5  5.   7.5 10. ]
#  add two numbers from diff list
a2 = [2, 5, 7]
b2 = [4, 6, 8]
c2 = []
n = len(a2)
for i in range(n):
    c2.append(a2[i]+ b2[i])
print(c2)

#  by numpy scaler operations 
an = np.array(a2)
bn = np.array(b2)
print(an + bn) # [ 6 11 15]
print(an - bn) #[-2 -1 -1]
print(an * bn) # [ 8 30 56]
print(an ** 2) # [ 4 25 49] 
print(an - 2) # [0 3 5] , this can't do by python 


#  given a list prices, updates then with gets included prices
prices = [50, 10, 40 , 500 , 400]
gst_p = []
for p in prices:
    gst_p.append(p+0.18*p)
print(gst_p) # [59.0, 11.8, 47.2, 590.0, 472.0]


np_prices = np.array(prices)
gst = np_prices*1.18
print(gst)


#  Touple 
num = (3, 4, 5, 6)
a4 = np.array(num)
print(a4) # [3 4 5 6]
print(type(num)) # <class 'tuple'> 

d = np.array([5, 4, 5.5 , 2])
print(d) # [5.  4.  5.5 2. ] numpy store same data tpyes , like int hai sab int , float hai toh sab float

#  STRINGS
names = np.array(["Rahul" , "Anuj" , "Gannu"])
print(names) # ['Rahul' 'Anuj' 'Gannu']
print(type(names)) # <class 'numpy.ndarray'>

 self decode questions 
 
bonus = 5;
marks = np.array([65, 72, 80, 91]);
updateMarks = bonus + marks;
print(marks);
print(updateMarks);
 
 
 
10% discount of every product
arr = np.array([100, 250, 400, 550, 800]);
discount = arr*10/100;
discount = arr*0.9 ## second method if 10 % discount than 100 - 10 = 90 so it's 0.9
prices = arr - discount;
print(discount);
print(prices);

every employee a 10% salary increment
salaries = np.array([30000, 35000, 40000, 45000, 50000]);
increment_salaries = salaries * 1.10;
print("salaries" , salaries);
print("increment_salaries", increment_salaries);

 tuple into array
tple = (72, 85, 92, 76, 88) 
np_tple = np.array(tple)
print(np_tple + 3);


 
sales = np.array([125000, 148000, 135000, 172000])
next_year_sales = sales*1.15
additional_sales = sales * 0.15
print(next_year_sales)
print(additional_sales);

###
a = np.array([120, 150, 180, 100, 200])
b = np.array([80, 130, 170, 120, 150])
total_inventory = a + b
difference = abs(a - b)
combined_inventory = (a + b ) + 20
print(total_inventory)
print(difference)
print(combined_inventory)


prices = np.array([250, 400, 750, 1200])
units = np.array([12, 8, 5, 10])
total_revenue = units  * prices 
forecast = total_revenue * 1.05
print("_Total_revenue", total_revenue)
print("total_revenue_inc", forecast);


arr3 = np.array ([[1, 3, 4,], [1, 3, 4,], [1, 3, 4,], [1, 3, 4,]])
print(arr3.ndim)
arr3.shape 
student_marks = np.array([[78, 85, 90, 88, 76 ],
                          [78, 85, 90, 88, 76 ],
                          [78, 85, 90, 88, 76 ],
                          [78, 85, 90, 88, 76 ],
                          [78, 85, 90, 88, 76 ]
                          ])
print(student_marks)
print("num_of_dimensions_ndim", student_marks.ndim)
print("total_num_value", student_marks.size)
print("shape", student_marks.shape)
print("data_type", student_marks.dtype)
print("number_of_student", student_marks.shape[0])
print("number_of_subject", student_marks.shape[1])

##

student_marks = np.zeros((5, 4))
student_marks1 = np.full((5,4), 50)
print(student_marks)
print(student_marks1)




marks = np.array([45, 56, 67, 78, 89])
bonus_marks = marks + 3
final_score = bonus_marks * 1.1
print(bonus_marks)
print(final_score)


linspace --> equal parts me todne ke liye help krta hain
targets = np.linspace(20000, 100000, 9)
actual_price = ([18000, 28000, 39000, 47000, 57000, 66000, 76000, 90000, 10500])
difference  = actual_price - targets
print("targets-->", targets)
print("Actual-->", actual_price)
print("Difference-->", difference)


arr = np.array([10, 20, 30.5, 40, 50.75])
int_arr = arr.astype(int) 
result = int_arr * 3
print(arr, arr.dtype)
print(int_arr)
print(result)


------
prices = np.array ([499, 799, 1299, 1999, 2499])
inc_prices = prices * 0.12 
revised_price = inc_prices + prices
final_prices = revised_price + 50 
print("Prices", prices)
print("Revised prices", revised_price)
print("Packaging", final_prices)

#------------------------------ 

marks = np.array([[72, 85, 90], [65, 78, 82],[88, 91, 84], [70, 76, 80]])
print(marks[2] )
print(marks[1,1])
marks[1,2]= marks[1, 2] + 5 
print(marks)
marks [3, 0] = marks[3, 0]+ 5
print("PLus 5 marks 4th stu, sub maths", marks)

sales = np.array([[120, 150, 180], [100, 130, 160,], [200, 220, 250]])
print("Sales branch 2 --> ", sales[1])
print("Branches in Feb" , sales[: , 1]) # : --> this means all rows and cul  
print("inc in March by  10 %" , sales[: , 2] * 1.10) 
sales[0,0] = 135
print(sales) 

--------------

employees = np.array([[30000, 2], [40000, 4], [50000, 6], [60000, 8]])
print(employees[-1])
print("Salary of 2nd employe", employees[1, 0])
print("ice salary  by 15 % ", employees[2, 0] * 1.15)
employees[0 , 1 ] = employees[0, 1] -1
print("Final employee salary", employees)

-----
inventory = np.array([[100, 120, 150], [80, 90, 110], [200, 180, 160,], [50, 70, 90]])
print(inventory[2])
print("Warehhouse b for all prd", inventory[: , 1])
print("Warehhouse a recive 20 unites additional for all prd", inventory[: , 0] + 20)
inventory[3, 2]  = 100
print(inventory)
marks = np.array([23, 56, 45, 23, 78, 98])
print(marks[1 : : 2])
print(marks[1 : 4])
print(marks[2 : 6])
print(marks[0 : 3])
print(marks[-2 :]) #[78 98]
print(marks[: -2]) # [23 56 45 23]
print(marks[:  : -1])# reverse order 

----------
arr2 = np.array([[100, 120, 150], [80, 90, 110], [200, 180, 160], [50, 70, 90]])
print(arr2[: 2])
print(arr2[1: 3])

print(arr2[: , : 2]) #  first cul
print(arr2[: , -2: ]) #  last cul 
print(arr2[0:6, 1:3])
print(arr2[: , 1:3] *  1.10)


