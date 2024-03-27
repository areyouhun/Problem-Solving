-- 코드를 입력하세요
SELECT b.author_id, a.author_name, b.category, sum(b.price * bs.sales) as total_sales from book b
join author a on b.author_id = a.author_id
join book_sales bs on b.book_id = bs.book_id
where to_char(bs.sales_date, 'YYYY-MM') = '2022-01'
group by b.author_id, a.author_name, b.category
order by b.author_id asc, b.category desc