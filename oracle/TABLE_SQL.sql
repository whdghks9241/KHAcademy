CREATE TABLE USER_INFO 
(
  USER_ID NUMBER(5) 
, COLUMN2 VARCHAR2(20) 
, COLUMN3 VARCHAR2(20) 
);

COMMENT ON COLUMN USER_INFO.USER_ID IS '유저 번호';

COMMENT ON COLUMN USER_INFO.COLUMN2 IS '유저 이름';

COMMENT ON COLUMN USER_INFO.COLUMN3 IS '유저 이메일';
