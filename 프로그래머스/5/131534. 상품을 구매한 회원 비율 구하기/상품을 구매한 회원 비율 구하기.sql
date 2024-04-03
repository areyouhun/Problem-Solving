select extract(year from os.sales_date) as year,
    extract(month from os.sales_date) as month,
    count(distinct ui.user_id) as puchased_users,
    round(count(distinct ui.user_id) 
          / (select count(*) from user_info
            where to_char(joined, 'YYYY') = '2021')
          , 1) as puchased_ratio
from user_info ui
join online_sale os on os.user_id = ui.user_id
where to_char(ui.joined, 'YYYY') = '2021'
group by extract(year from os.sales_date), 
        extract(month from os.sales_date)
order by extract(year from os.sales_date),
        extract(month from os.sales_date)