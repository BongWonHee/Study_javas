-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition
-- ORDER BY column_name(s);

-- 참조 : poll Statistic example -------------
-- 총 설문자 : 3명

select count(*) CNT
from
(SELECT 
    RESPONDENTS_ID, COUNT(RESPONDENTS_ID) AS CNT
    FROM
    statistics
    GROUP BY RESPONDENTS_ID) as T_STATIC 
;