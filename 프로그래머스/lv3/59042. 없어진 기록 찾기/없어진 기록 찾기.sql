-- 코드를 입력하세요
SELECT B.animal_id, B.name
FROM animal_ins A RIGHT JOIN animal_outs B ON A.animal_id = B.animal_id
WHERE A.animal_id is null
ORDER BY B.animal_id