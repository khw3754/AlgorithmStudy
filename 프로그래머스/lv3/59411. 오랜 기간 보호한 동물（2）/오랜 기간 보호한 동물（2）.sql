-- 코드를 입력하세요
SELECT A.animal_id, A.name
FROM animal_ins A JOIN animal_outs B ON A.animal_id = B.animal_id
ORDER BY datediff(B.datetime, A.datetime) DESC
LIMIT 2