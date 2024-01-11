-- 코드를 입력하세요
# 2022.5 예약한 환자 수를 진료과 코드 별로 조회 
SELECT MCDP_CD AS '진료과코드', COUNT(PT_NO) AS '5월예약건수'
FROM APPOINTMENT
WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') LIKE '2022-05'
GROUP BY MCDP_CD
ORDER BY 2 ASC, 1 ASC;