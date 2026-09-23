--USES ORDER BY

-- select.. 
-- from table.. 
-- order by ...

-- default order -- > ascending order


-- We wants products from lowest selling price to highest
select *
from `E1.order_items`
limit 5;


select 
 ProductID,
 SellingPrice
 from `E1.products`
 order by SellingPrice asc;


-- Show the most expensive products first;
select*
  from `E1.products`
  limit 5;

select 
 ProductID,
 SellingPrice
 from `E1.products`
 order by SellingPrice desc;

-- show the top 10 most expensive products

select 
 ProductID,
 SellingPrice
 from `E1.products`
 order by SellingPrice desc
 limit 10;

-- show the top 10 least expensive products
select 
 ProductID,
 SellingPrice
 from `E1.products`
 order by SellingPrice asc
 limit 10;
 
-- Display all products alphabetically

select*
 from `E1.products`
 order by ProductName asc;

-- Youngest customers _ oldest customers

select *
 from `E1.customers`
 limit 5;

select *
 from `E1.customers`
 order by  Age asc;


-- which inventory records have the lowest stoct

select *
from `E1.inventory`
limit 5;

select *
 from `E1.inventory`
 order by Stock asc;

-- show the top 5 most valuable payments

select *
from `E1.payments`
limit 5;
 
select *
from `E1.payments`
order by Amount desc;

-- Sorting order ites by sales value 
select *
from `E1.order_items`
limit 5;

select
  OrderID, 
 ProductID,
 Total
from `E1.order_items`
order by total desc;

-- show the highest-rated review recordds first
select *
from `E1.reviews`
limit 5;

select *
from `E1.reviews`
order by Rating desc;

-- show the prodcuts with mrp abobe 500 starting with most expensve 

select *
from `E1.products`
where MRP > 500
order by MRP desc;


-- find the 5 cheapest products whose mrp is above 700
select *
from `E1.products`
where mrp >700
order by MRP  asc
limit 5;

--suppliers with the largest product catalog first
-- catalog means different types of products

select *
from `E1.products`
limit 5;

select 
 SupplierID,
 count(*) as catalog_size
 from `E1.products`
 group by  SupplierID 
 order by catalog_size;

-- which 5 suppliers proviide the largest number of products
select 
 SupplierID,
 count(*) as catalog_size
 from `E1.products`
 group by  SupplierID 
 order by catalog_size desc
 limit 5;


 -- top 5 products by their total sales
select *
from `E1.order_items`
limit 5 ;

-- total = quantity * sellingprice

select 
 ProductID,
 sum(total) as total_sales
from `E1.order_items`
group by ProductID
order by  total_sales desc
limit 5;


-- sort products by category first, within each category sort by sp from high to low
select *
from `E1.products`
order by CategoryID asc, Sellingprice desc;

-- display the payment methos with the highest total payment amount at the top
select 
 Method,
 sum(Amount) as total_payment
from `E1.payments`
group by Method 
order by  total_payment desc;

-- sort customers by city alphabetically, and within each city sort customers by age from oldest to youngest
select *
from test.products
  order by city , age desc;

-- display the supplierId with
-- highest num of product first,
-- if tied , highest avg sp first

select 
 SupplierID, 
 count(*) as no_of_products,
 avg(SellingPrice) as avg_sp
from test.products
group by SupplierID
order by no_of_products desc, avg_sp desc;


-- sort products by category first, and within each category sort sp from high to low

select 
 productid,
 categoryid,
 sellingprice
from test.products
order by CategoryID, SellingPrice desc;
  
-- individual products whose mrp is > 20k
select *
from test.products
 where mrp > 20000;

-- supplier have more than 3 products
select 
 supplierid,
 count(*) as product_cnt
from test.products
group by supplierid
having product_cnt > 3;

-- which customers have placed more than 5 orders 
select *
 from test.orders
 limit 5;
 
select  
 CustomerID,
 count(*) as no_of_products
 from test.orders
 group by CustomerID
 having no_of_products > 5;
 
 
-- suppliers with 2 or fewer products
select *
 from test.products
limit 5 ;

select 
SupplierID,
 count(*) as prd_cnt
 from test.products
 group by SupplierID
 having prd_cnt <= 5;
 
--  products with sales above 50k
select
 ProductID,
 sum(total) as total_sales
 from test.order_items
group by ProductID
having total_sales > 50000


-- take product--> mrp >10k --> create supplier group--> count products-->  supplier > 2 --> sort high count first --> show top 5
-- row level filtering we use where clause , if group level filterning we use having clause 
select *
from test.products
limit 5;

 select 
  SupplierID,
  count(*) as total_cnt
  from test.products
  where mrp > 10
  group by SupplierID
  having total_cnt > 2
  order by total_cnt desc
  limit 5;
  
  
  
