-- 코드를 입력하세요
SELECT DISTINCT A.car_id
FROM CAR_RENTAL_COMPANY_CAR A JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B 
    ON A.car_id = B.car_id
WHERE car_type = '세단' and start_date like '2022-10-%'
ORDER BY car_id DESC