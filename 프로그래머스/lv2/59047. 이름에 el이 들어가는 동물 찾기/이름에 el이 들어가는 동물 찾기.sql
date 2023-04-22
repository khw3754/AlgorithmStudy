-- 코드를 입력하세요
SELECT animal_id, name FROM animal_ins
WHERE name like "%el%" and animal_type = 'dog'
ORDER BY name