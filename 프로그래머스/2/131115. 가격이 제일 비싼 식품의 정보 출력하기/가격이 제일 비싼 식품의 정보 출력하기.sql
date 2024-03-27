-- 코드를 입력하세요
select * from (SELECT * from food_product order by price desc) where rownum = 1