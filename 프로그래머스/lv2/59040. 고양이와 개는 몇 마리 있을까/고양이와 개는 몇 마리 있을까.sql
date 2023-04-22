-- 코드를 입력하세요
SELECT animal_type, count(*) FROM animal_ins
GROUP BY animal_type
HAVING animal_type in ('dog', 'cat')
ORDER BY animal_type