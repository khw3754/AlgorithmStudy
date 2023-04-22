-- 코드를 입력하세요
SELECT animal_id, name, 
    IF(SEX_UPON_INTAKE like "%Neutered%" or SEX_UPON_INTAKE like "%Spayed%", 'O', 'X')
FROM animal_ins
ORDER BY animal_id