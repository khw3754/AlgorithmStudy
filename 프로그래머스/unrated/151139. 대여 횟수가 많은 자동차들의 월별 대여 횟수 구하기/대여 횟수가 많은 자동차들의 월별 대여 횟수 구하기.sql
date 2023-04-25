-- 코드를 입력하세요
SELECT DATE_FORMAT(start_date, '%m') as MONTH, car_id, count(*) as RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE start_date BETWEEN '2022-08-01%' AND '2022-10-31%' AND car_id in
    (SELECT car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE start_date BETWEEN '2022-08-01%' AND '2022-10-31%'
    GROUP BY car_id
    HAVING count(*) >= 5)
GROUP BY car_id, DATE_FORMAT(start_date, '%m')
HAVING records > 0
ORDER BY month, car_id DESC