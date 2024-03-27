with rental_available as (
    select car_id
    from car_rental_company_rental_history
    group by car_id
    having max(start_date) > to_date('2022-11-30', 'YYYY-MM-DD')
        or max(end_date) < to_date('2022-11-01', 'YYYY-MM-DD')
)

select car.car_id,
        car.car_type,
        car.daily_fee * 30 * (1 - (dc.discount_rate / 100)) as fee
from car_rental_company_car car
join rental_available ra on car.car_id = ra.car_id
join car_rental_company_discount_plan dc on car.car_type = dc.car_type
where car.car_type in ('세단', 'SUV')
    and dc.duration_type = '30일 이상'
    and car.daily_fee * 30 * (1 - (dc.discount_rate / 100)) between 500000 and 2000000
order by fee desc, car.car_type asc, car.car_id desc