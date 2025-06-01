-- p1 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
use sqldb;
select userID as '사용자 아이디', sum(amount) as '총 구매 개수' from buytbl
GROUP BY userID;

-- p2 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
use sqldb;
select userID as '사용자 아이디', sum(amount * price) as '총 구매 개수' from buytbl
GROUP BY userID;

-- p3 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
use sqldb;
select avg(amount) as '총 구매 개수' from buytbl;


-- p4 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
use sqldb;
select avg(amount) as '총 구매 개수' from buytbl
group by userID;

-- p5 다음 결과가 나오도록 usertbl에 대한 SQL 문을 각각 작성하세요.
use sqldb;

(
  SELECT name, height FROM usertbl ORDER BY height ASC LIMIT 1
)
UNION
(
  SELECT name, height FROM usertbl ORDER BY height DESC LIMIT 1
);


-- p5 다음 결과가 나오도록 usertbl에 대한 SQL 문을 각각 작성하세요.

 SELECT 
    COUNT(*) AS '휴대폰이 있는 사용자'
FROM
    usertbl
WHERE
    mobile1 IS NOT NULL;



-- p6 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
use sqldb;
select userID, sum(price* amount) as '총구매액' from buytbl
group by userID
HAVING SUM(price * amount) >= 1000;

-- city테이블에서 국가코드가 'KOR'인 도시들의 인구수 총합을 구하시오.
use world;
select sum(population) from city
where countrycode = 'KOR';


-- city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최소값을 구하시오. 단 결과를 나타내는 테이블의 필드는 "최소값"으로 표시하시오.
use world;
select name, population as '최소값' from city
where countrycode = 'KOR'
order by population 
limit 1;

-- city 테이블에서 국가코드가 'KOR'인 도시들의 평균을 구하시오.
use world;
select avg(population) as '평균' from city
where countrycode = 'KOR';

-- city 테이블에서 국가코드가 'KOR'인 도시들의 인구수 중 최대값을 구하시오. 단 결과를 나타내는 테이블의 필드는 "최대값"으로 표시하시오.
use world;
select avg(population) as '평균' from city
where countrycode = 'KOR';

-- country 테이블 각 레코드의 Name 칼럼의 글자수를 표시하시오.
use world;
SELECT Name, CHAR_LENGTH(Name) AS 글자수
FROM country;

-- country테이블의 나라명(Name 칼럼)을 앞 세글자만 대문자로 표시하시오.
use world;
SELECT 
    Name, SUBSTRING(Name, 1, 3) AS '세글자'
FROM
    country;

-- country테이블의 기대수명(LifeExpectancy)을 소수점 첫째자리에서 반올림해서 표시하시오.
SELECT 
    Name, round(avg(LifeExpectancy),1) AS '기대수명'
FROM
    country
    group by name;


-- employees db에서 각 부서별 관리자를 출력하세요.
-- use employees;
-- select 
    




-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
-- ○ 사용자별로 구매 이력을 출력함
-- ○ 모든 컬럼을 출력함
-- ○ 구매 이력이 없는 정보는 출력하지 않음
-- 앞의 결과에서 userID가 'JYP'인 데이터만 출력하세요.



use sqldb;

SELECT *
FROM buytbl b INNER JOIN usertbl u
ON b.userID = u.userID;

use sqldb;


SELECT 
    *
FROM
    buytbl b
        INNER JOIN
    usertbl u ON b.userID = u.userID
WHERE
    b.userID = 'JYP';
    
    
--  각 사용자별로 구매 이력을 출력하세요.
-- ○ 연결 컬럼은 userID로 함
-- ○ 결과를 userID를 기준으로 오름차순으로 정렬함
-- ○ 구매이력이 없는 사용자도 출력하세요.
-- ○ userID, name, prodName, addr, 연락처를 다음과 같이 출력함
SELECT 
   u.userID, u.name, b.prodName, u.addr, CONCAT(u.mobile1, u.mobile2) as 연락처
FROM
    buytbl b
        INNER JOIN
    usertbl u ON b.userID = u.userID
    order by u.userID;
    
-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.

SELECT 
    *
FROM
    buytbl b
        INNER JOIN
    usertbl u ON b.userID = u.userID;
    
    






