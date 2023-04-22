-- 코드를 입력하세요
# select * from product where price < 10000
SELECT floor(price/10000) * 10000 as PRICE_GROUP, count(*) as PRODUCTS
FROM product
GROUP BY price_group
ORDER BY price_group