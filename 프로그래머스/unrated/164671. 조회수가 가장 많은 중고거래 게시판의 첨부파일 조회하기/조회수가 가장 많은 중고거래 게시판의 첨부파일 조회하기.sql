-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', board_id, '/', file_id, file_name, file_ext) as FILE_PATH
FROM USED_GOODS_FILE
WHERE board_id in 
    (SELECT board_id
    FROM USED_GOODS_BOARD
    WHERE views = (SELECT max(views) FROM USED_GOODS_BOARD))
ORDER BY file_id DESC