-- 코드를 입력하세요
SELECT mcdp_cd as '진료과 코드', count(*) as '5월 예약 건수'
FROM APPOINTMENT
WHERE apnt_ymd like '2022-05%'
GROUP BY mcdp_cd
ORDER BY count(*), mcdp_cd