-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
FROM first_half A JOIN icecream_info B ON A.flavor = B.flavor
GROUP BY INGREDIENT_TYPE
ORDER BY total_order