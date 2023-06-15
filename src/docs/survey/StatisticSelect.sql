-- 1) poll Statistic example의 설문자 3명 불러오기
-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition (GROUP BY의 조건은 HAVING에서)
-- ORDER BY column_name(s);
-- INNER JOIN 
-- ON
-- 설문을 한 사람은 설문 통계에서 볼 수 있다. 
-- 설문 통계테이블에서 설문한 사람들을 보고 싶다면 GROUP BY
-- 1) poll Statistic example의 설문자 3명 불러오기 
-- SELECT RESPONDENTS_ID, COUNT(*) AS CNT
-- FROM statistics
-- GROUP BY RESPONDENTS_ID
-- 여기서 하나 더 추가해야함. 이렇게 하면 한명이 몇개를 문항 답했는지만 나옴. 
SELECT COUNT(*) CNT
FROM (SELECT RESPONDENTS_ID, COUNT(*) AS CNT
FROM statistics
GROUP BY RESPONDENTS_ID) AS t_STATIC;

