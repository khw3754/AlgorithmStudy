-- 코드를 입력하세요
SELECT A.title, A.board_id, B.reply_id, B.writer_id, B.contents, LEFT(B.created_date, 10)
FROM USED_GOODS_BOARD A JOIN USED_GOODS_REPLY B ON A.board_id = B.board_id
WHERE A.created_date LIKE '2022-10%'
ORDER BY B.created_date, A.title