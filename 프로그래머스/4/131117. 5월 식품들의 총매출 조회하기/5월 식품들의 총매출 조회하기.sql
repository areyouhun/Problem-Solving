-- select distinct fp.product_id, 
--                 fp.product_name, 
--                 fp.price * (
--                     select sum(amount) 
--                     from food_order 
--                     where product_id = fp.product_id
--                 ) as total_sales
-- from food_order fo
-- join food_product fp on fo.product_id = fp.product_id
-- where to_char(fo.produce_date, 'YYYY-MM') = '2022-05'
-- order by total_sales desc, fp.product_id

select fp.product_id,
    fp.product_name,
    sum(fp.price * fo.amount) as total_sales
from food_order fo
join food_product fp on fo.product_id = fp.product_id
where to_char(fo.produce_date, 'YYYY-MM') = '2022-05'
group by fp.product_id, fp.product_name
order by total_sales desc, fp.product_id