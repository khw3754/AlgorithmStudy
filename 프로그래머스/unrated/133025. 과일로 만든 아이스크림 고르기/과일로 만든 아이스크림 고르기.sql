-- 코드를 입력하세요
SELECT A.flavor FROM first_half A JOIN icecream_info B ON A.flavor = B.flavor
WHERE A.total_order > 3000 and B.INGREDIENT_TYPE like 'fruit_based'
ORDER BY total_order DESC