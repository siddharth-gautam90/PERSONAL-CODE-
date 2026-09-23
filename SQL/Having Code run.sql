-- task Display supplierid and the num of prodcuts supplied by each supplier .
-- show suppliers with the high num of products first;
select 
 SupplierID,
  count(*) as no_of_prd
 from test.products
 group by SupplierID
order by no_of_prd desc;

--------- calcvulate the toatal value for each productid using total col from order_items
select * 
from test.order_items
limit 5;

select 
 ProductID,
 sum(total)as total_sales
 from test.order_items
 group by ProductID
 order by total_sales desc 
  limit 10;
  
-----display only products whoise total sales value is greater  than 50k
select 
 ProductID,
 sum(Total) as total_sales
 from test.order_items
 group by ProductID 
 having total_sales > 50000
 order by total_sales desc ;
 
 
---  task ffor only payments where status = 'status'
-- calculate thee num of transactions and total payment amount for each method
-- display method with high total payment amount fisrt 
 select 
 count(*)as no_of_trasactions,
 sum(amount) as total_payment
 from test.payments
 where Status = "success"
 group by Method
 order by total_payment desc;

---- calculate the number of orders placed by every cudstomerid
select 
 CustomerID,
 count(*) as order_placed
 from test.orders
 group by CustomerID
 having order_placed > 3
 order by order_placed desc ;
 
 
 -- task : considere only prodcuts havingg mrp grater than 20k
 -- for each catego 
 select 
  CategoryID,
 count(*) as total_prd
  from test.products
  where mrp > 20
  group by CategoryID
  having total_prd > 2
  order by total_prd desc;
  
  -- task : for every warehouseid, calculate:
  -- total stock 
  --  avg stock per inventory  recod,
  
  select 
   WarehouseID,
   sum(stock) as total_stocks,
   round(avg(stock), 2) as avg_stock,
   max(stock) as max_stock,
   min(stock) as min_stock
   from test.inventory
   group by WarehouseID
   order by total_stocks desc;
    
 --  task for eevery status in the orders  table , calculate the number of orders ,
 --  diaplay the most common order status fisrt 
 
 
select 
  Status, 
  count(*) as no_of_orders
  from test.orders 
  group by Status
  order by no_of_orders desc ;
  
  -----task : consider only order_items recodrs where sp > 20k
  -- 
  select 
   count(*)  as no_ of_records,
   sum(quantity) as total_qty,
   sum(total) as total_sales
   avg(SellingPrice) as avg_sp
    from test.order_items
   where SellingPrice > 10000
   group by ProductID
   having total_sales > 50000
   order by total_sales desc;
  ---
  select *
  from test.order_items
  limit 5;
 
 
 
 
 
 
 











