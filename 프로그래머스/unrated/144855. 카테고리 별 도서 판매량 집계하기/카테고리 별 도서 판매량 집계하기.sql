-- 코드를 입력하세요
SELECT category, sum(sales) as TOTAL_SALES
FROM book A JOIN book_sales B ON A.book_id = B.book_id
WHERE B.sales_date like '2022-01%'
GROUP BY category
ORDER BY category