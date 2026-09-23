-- show me the prodcuts name and acategrory name 

-- prodcuts-- Product Name 
-- linkage -- categoryID
-- CATEGRORYID -- CategoryName

-- tableName.coloumnName

-- syntax:
 
--  select 
--   from table1
--   join table2
--   on table1.key = table2.key

select 
  p.ProductID,
  p.ProductName,
  c.CategoryID,
  c.CategoryName
  from test.products as p
  join test.categories as c -- by default inner join 
  on p.CategoryID = c.CategoryID ;

-- Display prodcuts belonging to the electronics categroy
select 
  p.ProductID,
  p.ProductName,
  c.CategoryID,
  c.CategoryName
  from test.products as p
  join test.categories as c -- by default inner join 
  on p.CategoryID = c.CategoryID 
  where c.CategoryName = 'Electronics';
  
  
--   --display prodcuts with there category names , sorted by mrp from highest to low
select 
  p.ProductID,
  p.ProductName,
  p.MRP,
  c.CategoryID,
  c.CategoryName
  from test.products as p
  join test.categories as c -- by default inner join 
  on p.CategoryID = c.CategoryID 
  order by p.MRP desc ;

----- display ProductName, CategoryName and discount amount
select 
  p.ProductName,
  p.MRP,
  c.CategoryName,
  (p.MRP - p.SellingPrice ) as Discount
  from test.products as p
  join test.categories as c -- by default inner join 
  on p.CategoryID = c.CategoryID 
  order by  discount desc ;



