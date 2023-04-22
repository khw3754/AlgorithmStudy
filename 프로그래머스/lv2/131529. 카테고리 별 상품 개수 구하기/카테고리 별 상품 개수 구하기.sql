-- 코드를 입력하세요
SELECT LEFT(product_code, 2) as CATEGORY, count(*) as PRODUCTS
FROM product
GROUP BY category
ORDER BY category