-- 코드를 입력하세요
SELECT A.writer_id, nickname, 
    concat(city, ' ', street_address1, ' ', street_address2) as 전체주소, 
    concat(left(tlno, 3), '-', mid(tlno, 4, 4), '-', right(tlno, 4)) as 전화번호
FROM USED_GOODS_BOARD A JOIN USED_GOODS_USER B ON A.writer_id = B.user_id
GROUP BY A.writer_id
HAVING count(*) >= 3
ORDER BY A.writer_id DESC