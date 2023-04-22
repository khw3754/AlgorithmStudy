-- 코드를 입력하세요
SELECT car_type, count(*)
FROM CAR_RENTAL_COMPANY_CAR
WHERE options like '%시트%'
GROUP BY car_type
ORDER BY car_type