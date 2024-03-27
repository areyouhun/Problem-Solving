-- 코드를 입력하세요
SELECT ugu.user_id, ugu.nickname, sum(ugb.price) as total_sales
from used_goods_board ugb
join used_goods_user ugu ON ugu.user_id = ugb.writer_id
group by ugu.user_id, ugu.nickname, ugb.status
having ugb.status = 'DONE' and sum(ugb.price) >= 700000
order by sum(ugb.PRICE)