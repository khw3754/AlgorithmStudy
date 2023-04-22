-- 코드를 입력하세요
SELECT A.book_id, B.author_name, DATE_FORMAT(A.published_date, '%Y-%m-%d')
FROM book A JOIN author B ON A.author_id = B.author_id
WHERE category = '경제'
ORDER BY published_date