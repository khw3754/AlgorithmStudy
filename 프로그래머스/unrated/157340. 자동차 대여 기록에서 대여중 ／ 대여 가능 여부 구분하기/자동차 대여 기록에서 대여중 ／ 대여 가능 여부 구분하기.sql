-- 코드를 입력하세요
SELECT DISTINCT car_id, 
    CASE WHEN car_id in 
        (SELECT car_id
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE end_date >= '2022-10-16%' AND start_date <= '2022-10-16')
        THEN '대여중'
        ELSE '대여 가능'
    END as AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
ORDER BY car_id DESC


# SELECT car_id, 
#     CASE WHEN end_date >= '2022-10-16%' AND start_date <= '2022-10-16' THEN '대여중'
#     ELSE '대여 가능'
#     END AS AVAILABILITY
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# ORDER BY car_id DESC