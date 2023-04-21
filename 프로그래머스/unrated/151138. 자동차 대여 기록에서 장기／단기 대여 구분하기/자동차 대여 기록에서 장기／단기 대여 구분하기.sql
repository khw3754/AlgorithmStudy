-- 코드를 입력하세요
SELECT 
    HISTORY_ID,
    CAR_ID,
    DATE_FORMAT(START_DATE, '%Y-%m-%d'),
    DATE_FORMAT(END_DATE, '%Y-%m-%d'),
    IF(datediff(end_date,start_date)+1 >= 30, '장기 대여', '단기 대여') as RENT_DATE 
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE start_date LIKE '2022-09%'
ORDER BY history_id DESC