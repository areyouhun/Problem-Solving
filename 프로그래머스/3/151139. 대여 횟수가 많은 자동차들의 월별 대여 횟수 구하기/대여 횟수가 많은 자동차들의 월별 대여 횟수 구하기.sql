with filtered as (
    select car_id 
    from car_rental_company_rental_history
    where 1 = 1
        and start_date between TO_DATE('2022-08-01', 'YYYY-MM-DD') AND TO_DATE('2022-10-31', 'YYYY-MM-DD')
    group by car_id
    having count(*) >= 5
)

select to_number(to_char(start_date, 'FMMM')) as month,
    car_id,
    count(*) as records
from car_rental_company_rental_history
where 1 = 1
    and car_id in (select * from filtered)
    and start_date BETWEEN TO_DATE('2022-08-01', 'YYYY-MM-DD') AND TO_DATE('2022-10-31', 'YYYY-MM-DD')
group by to_char(start_date, 'FMMM'), car_id
order by month asc, car_id desc