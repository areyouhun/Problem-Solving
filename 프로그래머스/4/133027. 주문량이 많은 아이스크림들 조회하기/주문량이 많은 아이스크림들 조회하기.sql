-- 코드를 입력하세요
with july_grouped as
(
    select flavor, sum(total_order) as total_order
    from july
    group by flavor
)

select f.flavor
from first_half f
join july_grouped jg on f.flavor = jg.flavor
order by (f.total_order + jg.total_order) desc
fetch first 3 rows only