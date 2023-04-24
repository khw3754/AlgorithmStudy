-- 코드를 입력하세요
SELECT food_type, rest_id, rest_name, favorites
FROM rest_info
WHERE (food_type, favorites) in 
    (SELECT food_type, max(favorites)
    FROM REST_INFO
    GROUP BY food_type)
ORDER BY food_type DESC