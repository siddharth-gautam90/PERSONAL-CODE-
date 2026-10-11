import numpy as np 
revenue = np.array([120000, 135000, 142000, 150000, 165000, 172000])
print("Third revenue", revenue[2])
print("last revenue", revenue[-1])
print("2 to 5 revenue", revenue[1:5])
print("ine rev by 10% last 3 months revenue", revenue[-3: ]  * 1.10)
print("Final Rev ", revenue)

----------
prices = np.array([500, 750, 1200, 1500, 200, 2500])
print("First three prices", prices[: 3])
print("last two prices", prices[-2: ])
print("15% discount at  idx 2 through 5", prices[2: 5] * 0.85)
print("50 price add at first prd", prices[0] + 50)

--------
units = np.array([180, 220, 195, 250, 280, 240])
print("4th month", units[3])
print("Last 3 months", units[-3: ])
print("8% inc new consumption bill", units * 1.08)


---------

production = np.linspace(500, 1500, 30)
print(production)
days = np.arange(1 , 31)
print("First five prodcuion target", production[: 5])
print("last five prodcuion target", production[-5: ])
print("inc0by 10%", production * 1.1)
print("First five prodcuion target", production[: 5])


--- 
marks = np.array([[72, 85, 90, 78], [65, 70, 75, 80], [88, 92, 95, 90], [55, 65, 60, 70], [89, 76, 45, 90]])
print(marks.ndim)
print("Shape of  matirx", marks.shape)
print("Total num of values", marks.size)
print(" 3rd student marks ", marks[2])
print("All students marks 2nd sub ", marks[:, 1])
print("Marks of 1st 3 stud & first 2 sub ", marks[:3, :2])
print("Marks of last  2 stud in the 4th sub", marks[ -2:, 3] * 1.05)

---------

prices = np.array([ 120,180, 250, 300, 450, 600])
print("add 20 first two items", prices[ : 2]  + 20)
print("10% discount items 3, 4 and 5", prices[2 : 5] * 0.9)
print("first two prices", prices[: 3])
print("last two prices", prices[-2:])

-----------
temperature = np.array([28, 29, 30, 31, 33, 35, 36, 35, 34, 20, 29])
print("first 6 hours readings", temperature[: 6])
print("last 6 hours readings", temperature[-6:])
print("every alternate hour", temperature[: : 2])
print("every 3 hour", temperature[: : 3])
print("reverse order ", temperature[: : -1])
print("reverse last 4 hours order ", temperature[-1 : -5: -1])


-----------

warehouse = np.full((4,5), 100)
print(warehouse)
print("Inc first two sections by 20 unites", warehouse[:2, :] + 20) # rows
print("reduce stock last two products by 10%", warehouse[:, -2:] * 0.9)
print("Display only two middle section ", warehouse[1:3, :])
print("Display only first 3 products", warehouse[:, :3]) #col
print("bottmm 2 x 2 portion of the martix", warehouse[-2:, -2:])


--------------
salary = np.array([[30000, 5000], [40000, 6000], [50000, 8000], [60000, 10000]])
#col 1 = basic salary
#col 2 = allowance
print("comple info of 2nd employe", salary[1, :])
print("all basic salary", salary[:, 0])
print("all allowance ", salary[:, 1])
print("inc all allowance by 1000 ", salary[:, 1] + 1000)
print("10% inc last two employe basic salary", salary[-2:, 0] * 1.1)

-----------startUp_grows
users = np.linspace(10000, 100000, 12)
print(users)
months = np.arange(1, 13)
print(months)
print("Display users in month 1 ", users[0])
print("Display users in month 12 ", users[-1])
print("Display users in month 4 - 8", users[ 3 :8])
print("inc targests by anothers 15 % ", users * 1.15)
print("last 4 months", users[-4:])

-- square of num
numbers = ([4, 9, 16, 25])
print(np.sqrt(numbers))

-----Distance from origin
x = np.array([3, 5, 8])
y = np.array([4, 12, 15])
distance = np.sqrt(x**2 + y**2)
print(distance)
distance = np.power(x,  3) #cube of num
print(distance)
print(np.cbrt(distance))

-- find the abs value of num --- convert negative to positive num
num = np.array([-10, -5, 6, 0, 10])
print(np.abs(num))

in python 
n = len(num)
for i in range(n):
 if num[i] < 0:
     num[i] *= -1
print("PY PYTHON ",num)

#round the values
values = np.array([10.2345, 20.6789, 30.4567])
print(np.round(values, 2))
--- round down -- lessser than in values by floor only for positive num        
values = np.array([2.1, 2.9, 5.5, 7.99])
print(np.floor(values)) # [2. 2. 5. 7.]
--- round up -- greater than in values by ceil
values = np.array([2.1, 2.9, 5.5, 7.99])
print(np.ceil(values)) # [3. 3. 6. 8.]
--------np.trunc -- this is for negative and positive num remove decimal point
values = np.array([2.9, 5.7, 3.8, -7.2])
print(np.trunc(values))

---------- 
col 1 = order id
col 2 = quantity
col 3 = price per item
orders = np.array([[1000, 2, 500],[1001, 3, 750], [1002, 1, 1200], [1003, 4, 300],[1004, 2, 900]])
print(orders[2])
print(" All Quantity", orders[:, 1])
print("All prices", orders[:, 2])
print("first three orders", orders[:3,0])
print("last two orders", orders[-2:,0])
print("inc by 10% last two orders", orders[-2:,-1] * 1.1)
print("inc the quantity first order by 1", orders[0,1] + 1)
quantity_prices = orders[:, 1:3] #create seperate aaray containg only the quantity & prices col
print(quantity_prices)

----------- 
rows = q1, q2, q3, q4
col = revenue , expense
financials = np.array([[120, 80], [150, 90], [180, 110], [200, 130]])
print("complete financial data", financials[1])
print("All revenue", financials[:, 0])
print("All expense", financials[:, 1])
print("extract q2 and q3 data", financials[1:3, ])
print("inc by 15% q4 ", financials[3,0] * 1.15)
print("reduce by 10% q1 ", financials[0, 1] * 0.9)

----------
occupied = 1
empty = 0
classroom = np.full((6, 5), 0)
print("first seat of the first row occupied ", classroom[0, 0, ] + 1)
print("all seat in third row occupied ", classroom[2] + 1)
print("last 2 seat of the last row occupied ", classroom[-1, -2: ] + 1)
print("first three rows", classroom[ :3 ] )
print("last two col", classroom[ :, -2: ] )







