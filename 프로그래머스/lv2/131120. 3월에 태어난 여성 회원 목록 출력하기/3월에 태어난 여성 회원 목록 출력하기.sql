-- 코드를 입력하세요
SELECT member_id, member_name, gender, 
    TO_CHAR(date_of_birth,'YYYY-MM-DD') AS date_of_birth
FROM member_profile
WHERE tlno NOT IN('NULL')
AND gender = 'W'
AND TO_CHAR(date_of_birth, 'MM') = '03'
ORDER BY member_id ASC;