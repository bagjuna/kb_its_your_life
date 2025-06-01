drop database tabledb;
create database tabledb;
use tabledb;

DROP TABLE IF EXISTS usertbl;
CREATE TABLE usertbl(
userID CHAR(8) NOT NULL PRIMARY KEY,
name VARCHAR(10) NOT NULL,
birthYear INT NOT NULL,
addr CHAR(2) NOT NULL,
mobile1 CHAR(3) NULL,
mobile2 CHAR(8) NULL,
height SMALLINT NULL,
mDate DATE NULL
);


DROP TABLE IF EXISTS buytbl;
CREATE TABLE buytbl(
num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
userid CHAR(8) NOT NULL,
prodName CHAR(6) NOT NULL,
groupName CHAR(4) NULL,
price INT NOT NULL,
amount SMALLINT NOT NULL,
FOREIGN KEY(userid) REFERENCES usertbl(userID)
);

INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');

INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', '생활품', 30, 2);
INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES(NULL, 'KKH', '모니터', '전자', 200, 1);





