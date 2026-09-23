 
 --------- FIND THE PRODUCTS WHOSE MRP IS ABOVE THE AVG MRP

 select *
 from test.products
 where MRP >= (
                select avg(MRP)
                from test.products
                );

--------- FIND THE PRODUCTS WHOSE MRP IS BELOW THE AVG MRP
  select *
 from test.products
 where MRP <= (select avg(MRP)from test.products);
 
-- FIND THE PRODUCTS WHOSE PRODUCTS HSAVING HIGHEST MRP
select *
 from test.products
 where MRP = (
 select max(MRP) as max_mrp 
 from test.products );  
 
 
 ----------- 
 
   
   
----- filter out thhose products whose mrp is among the top 5 distinct highest mrps
  -- select *
--  from test.products
--  where MRP = (
--  select min(distinct  MRP) as min_mrp 
--  from test.products 
--  order by min_mrp desc
--  limit 5); 
 
 select
 distinct mrp
 from test.products
 order by mrp desc 
 limit 5;
 
select *
 from test.products
 where MRP in(4937, 4927, 4880, 4698, 4662);


-- ------------- SubQuery-------
  select *
   from test.products
   where MRP in ( select
				 distinct (mrp)
				 from test.products
				 order by mrp desc 
                 ) ;
  
  ----
   select *
   from test.products
   where MRP IN ( select
				 distinct axrp)
                 from test.products
				 order by mrp desc 
                 );
  
  
  