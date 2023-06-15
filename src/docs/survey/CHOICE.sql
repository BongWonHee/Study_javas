--     -- 참조 : poll contents example --
-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.

-- SELECT *
-- FROM question_choice
-- WHERE QUESTIONS_ID = 'Q1';
-- -- 이걸 조인 시켜야함. 
SELECT t_CHO.CHOICE_ID, t_CHO.CHOICE
FROM question_choice AS t_QUES
 INNER JOIN choice AS t_CHO
 ON t_QUES.CHOICE_ID = t_CHO.CHOICE_ID
AND QUESTIONS_ID = 'Q1';
-- 2번 질문에 대한 답항 또한 동일하게 나올것. 2번째 문항에 대한 답안. 
SELECT t_CHO.CHOICE_ID, t_CHO.CHOICE
FROM question_choice AS t_QUES
 INNER JOIN choice AS t_CHO
 ON t_QUES.CHOICE_ID = t_CHO.CHOICE_ID
AND QUESTIONS_ID = 'Q2';
-- 결론은 문답문답에 대한건 QUESTIONS_ID 변경으로 할 수 있음. 
-- 쿼리 작성이 먼저다. 



