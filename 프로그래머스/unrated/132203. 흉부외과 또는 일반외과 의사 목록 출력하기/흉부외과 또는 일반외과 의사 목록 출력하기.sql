-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, DATE_FORMAT(hire_ymd, '%Y-%m-%d')
FROM doctor
WHERE mcdp_cd like 'CS' or mcdp_cd like 'GS'
ORDER BY hire_ymd DESC, dr_name