-- 코드를 입력하세요
SELECT *
FROM places
WHERE host_id in 
    (SELECT host_id
    FROM places
    GROUP BY host_id
    HAVING count(*) > 1)
ORDER BY id