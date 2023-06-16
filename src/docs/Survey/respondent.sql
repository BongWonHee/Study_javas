-- SELECT column_name(s)
-- FROM table_name
-- WHERE condition
-- GROUP BY column_name(s)
-- HAVING condition
-- ORDER BY column_name(s);

-- 설문자 가능 명단(가입 완료)
-- 1. 홍길동, 2.장길산, 3.신사임당, ...
select RESPONDENTS
from respondents
;

-- 설문 시작
-------- 참조 : poll contents example -------------
-- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.
-- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
-- (1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다.

select *
From questions
 ;


select T_CHO.CHOICE_ID, T_CHO.CHOICE
from question_choice as T_QUES
inner join choice as T_CHO
on T_QUES.CHOICE_ID = T_CHO.CHOICE_ID
and QUESTIONS_ID = 'Q1';

select T_CHO.CHOICE_ID, T_CHO.CHOICE
from question_choice as T_QUES
inner join choice as T_CHO
on T_QUES.CHOICE_ID = T_CHO.CHOICE_ID
and QUESTIONS_ID = 'Q2';

-- 응답자에 대한 설문 입력
delete from statistics
where RESPONDENTS_ID = 'R1'
;

insert into statistics
(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)
value
('ST-01','R1','Q1','C3')
;

insert into statistics
(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)
value
('ST-02','R1','Q2','C1')
;