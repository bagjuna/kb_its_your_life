-- 1 현재 서버에 존재하는 데이터베이스 확인
-- SHOW databases 

-- 2 현재 데이터베이스를 employees로 설정하기
use employees;

-- 3 employees 데이터베이스의 테이블 목록 보기
show tables;

-- 4 employees 테이블의 열 목록 출력하기
DESCRIBE employees;

-- 5 titles 테이블의 데이터 출력하기
use employees;
SELECT * from titles; 

-- 6 employees 테이블에서 first_name 컬럼만 출력하기
use employees;
select first_name
from employees;

-- 7. employees 테이블에서 first_name 컬럼, last_name 컬럼, gender 컬럼 출력하기
use employees;
SELECT first_name, last_name, gender
from employees;

-- 8. employees 테이블 출력시 다음과 같이 나오도록 쿼리를 작성하세요
use employees;
SELECT first_name AS '이름',  gender AS '성별', hire_date AS '회사 입사일'
from employees;

-- 9. 배포된 sqldb.sql 파일을 이용하여 sqldb 데이터베이스를 구축하세요.
use sqldb;
select * from buytbl;
select * from usertbl;

-- 10. usertbl 테이블에서 이름이 '김경호'인 행을 출력하세요.
use sqldb;
select * from usertbl
where name = '김경호';

-- 11. usertbl 테이블에서 생년이 1970 이상이고 키가 182이상인 데이터를 출력하세요
use sqldb;
select * from usertbl
where birthYear >= 1970 AND height >= 182;

-- 12. usertbl 테이블에서 키가 180~183 범위인 데이터를 출력하세요.
use sqldb;
select * from usertbl
-- where height >= 180 AND height <= 183;
where height between 180 AND 183;

-- 13. usertbl 테이블에서 주소가 '경남' 또는 '전남' 또는 '경북'인 데이터를 출력하세요.
use sqldb;
select * from usertbl
where addr in ('경남', '전남', '경북');

-- 14. usertbl 테이블에서 이름이 '김'으로 시작하는 데이터를 출력하세요.
use sqldb;
select * from usertbl
where name like '김%';

-- 15. usertbl에서 김경호 보다 큰 사람들의 이름과 키를 출력하세요.
use sqldb;
select name, height from usertbl
where height > (select height from usertbl where name = '김경호');


-- 16. usertbl을 mdate의 오름 차순으로 정렬하여 출력하세요.
USE sqldb;
SELECT * FROM usertbl
ORDER BY mdate ASC;

-- 17. usertbl을 mdata의 내림 차순으로 정렬하여 출력하세요.
USE sqldb;
SELECT * FROM usertbl
ORDER BY mdate DESC;

-- 18. usertbl을 height의 내림차순으로 정렬하고, 동률인 경우 name의 내림차순으로 정렬하여 출력하세요.
USE sqldb;
SELECT * FROM usertbl
ORDER BY height DESC, name DESC;


-- 19. usertbl의 주소지를 중복없이 오름 차순으로 출력하세요.
USE sqldb;
SELECT DISTINCT addr FROM usertbl
ORDER BY addr ASC;

-- 20. 국가 코드가 'KOR'인 도시를 찾아 인구수를 역순으로 표시하세요.
use world;
select * from city
where CountryCode = 'KOR'
order by Population DESC;

-- 21. city 테이블에서 국가코드와 인구수를 출력하라. 정렬은 국가코드별로 오름차순으로, 동일한 코드(국가) 안에서는 인구 수의 역순으로 표시하세요.
use world;
select CountryCode, Population from city
order by CountryCode ASC, Population DESC;

-- 22. city 테이블에서 국가코드가 'KOR'인 도시의 수를 표시하세요.
use world;
select count(*) from city
where CountryCode = 'KOR';

-- 23. city 테이블에서 국가코드가 'KOR', 'CHN', 'JPN'인 도시를 찾으세요.
use world;
select * from city
where CountryCode in ('KOR', 'CHN', 'JPN');

-- 24. 국가코드가 'KOR'이면서 인구가 100만 이상인 도시를 찾으세요.
use world;
select * from city
where CountryCode = 'KOR' AND Population >= 1000000;

-- 25. 국가 코드가 'KOR'인 도시 중 인구수가 많은 순서로 상위 10개만 표시하세요.
use world;
select * from city
where CountryCode = 'KOR'
order by Population desc
limit 0, 10;


-- 26. city 테이블에서 국가코드가 'KOR'이고, 인구가 100만 이상 500만 이하인 도시를 찾으세요.
use world;
select * from city
where CountryCode = 'KOR'
and Population between 1000000 AND 5000000
limit 0, 10;


