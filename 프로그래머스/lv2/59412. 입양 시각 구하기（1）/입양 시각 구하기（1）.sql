-- 코드를 입력하세요
# select * from animal_outs
SELECT DATE_FORMAT(datetime, '%H') as HOUR, count(*) as COUNT 
FROM animal_outs
GROUP BY hour
HAVING hour >= 9 and hour <= 19
ORDER BY hour