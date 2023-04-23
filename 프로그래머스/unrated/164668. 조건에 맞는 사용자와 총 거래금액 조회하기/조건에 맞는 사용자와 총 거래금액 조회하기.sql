-- 코드를 입력하세요
SELECT B.user_id, B.nickname, sum(price) as TOTAL_SALES
FROM used_goods_board A JOIN used_goods_user B ON A.writer_id = B.user_id
WHERE A.status = 'DONE'
GROUP BY B.user_id
HAVING total_sales >= 700000
ORDER BY total_sales