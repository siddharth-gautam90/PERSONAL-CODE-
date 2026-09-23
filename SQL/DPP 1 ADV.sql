---1)
select
 SupplierID, 
 count(*)  as no_of_prodcuts,
 avg(MRP)as avg_MRP,
 max(MRP) as max_MRP
from test.products
group by SupplierID
having no_of_prodcuts >=3
order by no_of_prodcuts desc;


--2)
select 
 CategoryID,
 count(*) as no_of_prodcuts,
 round(avg(MRP),2) as avg_mrp,
 max(MRP) as max_mrp
from test.products
group by CategoryID
having avg_mrp > 150
order by avg_mrp desc ;

--3)
select 
ProductID,
 sum(Quantity) as total_qty,
 sum(Total) as total_price
from test.order_items
group by ProductID
having total_qty >= 10 and total_price > 100000 
order by total_price desc ;

-4)
select
  ProductID,
  ProductName,
  MRP,
  SellingPrice,
  (MRP - SellingPrice) as discount_amount
  from test.products 
  where MRP > SellingPrice
  order by SellingPrice desc ;
  
5)
select
  ProductID,
  ProductName,
  MRP,
  SellingPrice, 
  round(((MRP - SellingPrice)/ MRP),2)/ 100 as discount_percentage
  from test.products 
  where round(((MRP - SellingPrice)/ MRP),2)* 100 >= 10
  order by discount_percentage desc;
  
  
  -- 6 )
  select 
   Method,
   count(*) as success_pym,
   sum(Amount) as total_amount,
   round(avg(Amount),2) as avg_payment,
   max(Amount) as max_amount
  from test.payments
  where Status = "Success"
  group by Method
  having total_amount > 100000;
  
  
  --  7)
  select 
   CustomerID,
   count(*) as no_of_orders
   from test.orders
   group  by CustomerID
   having no_of_orders between 4 and 9
   order by no_of_orders desc
   limit 10;
   
-- 8)
select 
WarehouseID,
 SUM(Stock) as total_Stock,
 avg(Stock) as avg_stock,
 max(Stock) as max_stock,
 min(Stock)  as min_stock
 from test.inventory
 group by WarehouseID
 having total_Stock > 500
 order by total_Stock desc;
 
-- 9

 select 
 ProductID,
 count(*)  as no_of_record,
 max(Stock) as max_stock,
 min(Stock)  as min_stock
 from test.inventory
 group by ProductID
  having max_stock < 20
 order by max_stock;
 
 ---  DPP 2ND START 
 -- 1) 
 select 
  Status,
  count(*) as no_of_order,
  count(*)*100.0/(select count(*) from  test.orders as percentage_of_order
  from test.orders
  group by Status
  order by no_of_order desc ;

select 
count(*) 
from  test.orders;

-- 2
 select 
  ProductID,
  sum(Quantity) as total_qtuy_sold,
  count(*) as total_qty_sold,
  sum(Total) as total_sale_value
 from test.order_items
 group by ProductID
 order by total_qtuy_sold  desc   
 limit 5;
 
 -- 3
 select 
  ProductID,
  count(*) as no_of_recods,
  sum(Quantity) as total_qty,
  sum(Total) as total_sale_value
 from test.order_items
 where total > 2500
 group by ProductID
 having no_of_recods >= 3;

 
  -- 4)
  select
   ProductID,
   min(SellingPrice) as min_sp,
   max(SellingPrice) as max_sp,
   round(avg(SellingPrice),2) as avg_sp,
   count(*) no_of_order_items
  from test.order_items
  group by ProductID
  having min_sp > 1000
  order by avg_sp desc;
  
  
  
   
  
  
  
  
  
  
  
  
  
  
  
  
  






