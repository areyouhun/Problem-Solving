-- 코드를 입력하세요
SELECT DISTINCT o1.user_id, o1.product_id 
FROM ONLINE_SALE o1
JOIN ONLINE_SALE o2 
ON o1.USER_ID = o2.USER_ID 
	AND o1.PRODUCT_ID = o2.PRODUCT_ID
	AND o1.online_sale_id != o2.online_sale_id
ORDER BY o1.USER_ID ASC, o1.PRODUCT_ID DESC;