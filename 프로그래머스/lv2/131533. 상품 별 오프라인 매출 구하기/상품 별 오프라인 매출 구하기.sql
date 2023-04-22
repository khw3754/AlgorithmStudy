-- 코드를 입력하세요
SELECT product_code, sum(sales_amount)*price as SALES
FROM product A JOIN offline_sale B ON A.product_id = B.product_id
GROUP BY product_code
ORDER BY SALES DESC, product_code