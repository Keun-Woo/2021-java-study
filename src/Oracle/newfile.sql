SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX IDX_ZIPTB_ZIPCODE ON ZIPTB;




/* Drop Tables */

DROP TABLE IF EXISTS BUYPROD;
DROP TABLE IF EXISTS CART;
DROP TABLE IF EXISTS PROD;
DROP TABLE IF EXISTS BUYER;
DROP TABLE IF EXISTS LPROD;
DROP TABLE IF EXISTS MEMBER;
DROP TABLE IF EXISTS ZIPTB;




/* Create Tables */

CREATE TABLE BUYER
(
	-- 거래처 코드
	BUYER_ID char(6) NOT NULL COMMENT '거래처 코드',
	-- 거래처 명
	BUYER_NAME varchar(60) NOT NULL COMMENT '거래처 명',
	-- 상품 분류 코드
	BUYER_LGU char(4) NOT NULL COMMENT '상품 분류 코드',
	-- 은행
	BUYER_BANK varchar(60) COMMENT '은행',
	-- 계좌 번호
	BUYER_BANKNO varchar(60) COMMENT '계좌 번호',
	-- 예금주
	BUYER_BANKNAME varchar(15) COMMENT '예금주',
	-- 우편번호
	BUYER_ZIP char(7) COMMENT '우편번호',
	-- 주소1
	BUYER_ADD1 varchar(100) COMMENT '주소1',
	-- 주소2
	BUYER_ADD2 varchar(70) COMMENT '주소2',
	-- 전화번호
	BUYER_COMTEL varchar(14) NOT NULL COMMENT '전화번호',
	-- FAX 번호
	BUYER_FAX varchar(20) NOT NULL COMMENT 'FAX 번호',
	-- 이메일 주소
	BUYER_MAIL varchar(60) NOT NULL COMMENT '이메일 주소',
	-- 담당자
	BUYER_CHARGER varchar(20) COMMENT '담당자',
	-- 구내 전화번호
	BUYER_TELEXT varchar(2) COMMENT '구내 전화번호',
	PRIMARY KEY (BUYER_ID),
	UNIQUE (BUYER_ID),
	UNIQUE (BUYER_LGU)
);


CREATE TABLE BUYPROD
(
	-- 입고 일자
	BUY_DATE date NOT NULL COMMENT '입고 일자',
	-- 상품 코드
	BUY_PROD varchar(10) NOT NULL COMMENT '상품 코드',
	-- 매입 수량
	BUY_QTY int NOT NULL COMMENT '매입 수량',
	-- 매입 단가
	BUY_COST int NOT NULL COMMENT '매입 단가',
	PRIMARY KEY (BUY_DATE, BUY_PROD),
	UNIQUE (BUY_PROD)
);


CREATE TABLE CART
(
	-- 회원 ID
	MEM_ID varchar(15) NOT NULL COMMENT '회원 ID',
	-- 주문 번호
	CART_NO char(13) NOT NULL COMMENT '주문 번호',
	-- 상품 코드
	PROD_ID varchar(10) NOT NULL COMMENT '상품 코드',
	-- 수량
	CART_QTY decimal(8) NOT NULL COMMENT '수량',
	PRIMARY KEY (CART_NO, PROD_ID),
	UNIQUE (MEM_ID),
	UNIQUE (PROD_ID)
);


CREATE TABLE LPROD
(
	-- 순번
	LPROD_ID smallint NOT NULL COMMENT '순번',
	-- 상품 분류 코드
	LPROD_GU char(4) NOT NULL COMMENT '상품 분류 코드',
	-- 상품 분류 명
	LPROD_NM varchar(40) NOT NULL COMMENT '상품 분류 명',
	PRIMARY KEY (LPROD_GU),
	UNIQUE (LPROD_GU)
);


CREATE TABLE MEMBER
(
	-- 회원 ID
	MEM_ID varchar(15) NOT NULL COMMENT '회원 ID',
	MEM_PASS varchar(15) NOT NULL,
	-- 성명
	MEM_NAME varchar(50) NOT NULL COMMENT '성명',
	-- 주민등록번호 앞 6자리
	MEM_REGNO1 char(6) NOT NULL COMMENT '주민등록번호 앞 6자리',
	-- 주민등록번호 뒤 7자리
	MEM_REGNO2 char(7) NOT NULL COMMENT '주민등록번호 뒤 7자리',
	-- 생일
	MEM_BIR date COMMENT '생일',
	-- 우편번호
	MEM_ZIP char(7) NOT NULL COMMENT '우편번호',
	-- 주소1
	MEM_ADD1 varchar(100) NOT NULL COMMENT '주소1',
	-- 주소2
	MEM_ADD2 varchar(80) NOT NULL COMMENT '주소2',
	-- 집 전화번호
	MEM_HOMETEL varchar(14) NOT NULL COMMENT '집 전화번호',
	-- 회사 전화번호
	MEM_COMTEL varchar(14) NOT NULL COMMENT '회사 전화번호',
	-- 이동전화
	MEM_HP varchar(15) COMMENT '이동전화',
	-- E-MAIL 주소
	MEM_MAIL varchar(40) NOT NULL COMMENT 'E-MAIL 주소',
	-- 직업
	MEM_JOB varchar(40) COMMENT '직업',
	-- 취미
	MEM_LIKE varchar(40) COMMENT '취미',
	-- 기념일 명
	MEM_MEMORIAL varchar(40) COMMENT '기념일 명',
	-- 기념일 날짜
	MEM_MEMORIALDAY date COMMENT '기념일 날짜',
	-- 마일리지
	MEM_MILEAGE int COMMENT '마일리지',
	-- 삭제 여부
	MEM_DELETE varchar(1) COMMENT '삭제 여부',
	PRIMARY KEY (MEM_ID),
	UNIQUE (MEM_ID)
);


CREATE TABLE PROD
(
	-- 상품 코드
	PROD_ID varchar(10) NOT NULL COMMENT '상품 코드',
	-- 상품명
	PROD_NAME varchar(4) NOT NULL COMMENT '상품명',
	-- 상품 분류 코드
	LPROD_GU char(4) NOT NULL COMMENT '상품 분류 코드',
	-- 거래처 코드
	BUYER_ID char(6) NOT NULL COMMENT '거래처 코드',
	-- 매입가
	PROD_COST int NOT NULL COMMENT '매입가',
	-- 소비자가
	PROD_PRICE int NOT NULL COMMENT '소비자가',
	-- 판매가
	PROD_SALE int NOT NULL COMMENT '판매가',
	-- 상품 개략 설명
	PROD_OUTLINE varchar(100) NOT NULL COMMENT '상품 개략 설명',
	PRIMARY KEY (PROD_ID),
	UNIQUE (PROD_ID),
	UNIQUE (LPROD_GU),
	UNIQUE (BUYER_ID)
);


CREATE TABLE ZIPTB
(
	-- 우편번호
	ZIPCODE char(7) NOT NULL COMMENT '우편번호',
	-- 특별시, 광역시, 도
	SIDO varchar(2) NOT NULL COMMENT '특별시, 광역시, 도',
	-- 시, 군, 구
	GUGUN varchar(10) NOT NULL COMMENT '시, 군, 구',
	-- 읍, 면, 동, 리, 건물명
	DONG varchar(30) NOT NULL COMMENT '읍, 면, 동, 리, 건물명',
	-- 번지, 아파트 동, 호수
	BUNJI varchar(10) NOT NULL COMMENT '번지, 아파트 동, 호수',
	-- 자료 순서
	SEQ smallint NOT NULL COMMENT '자료 순서'
);



/* Create Foreign Keys */

ALTER TABLE PROD
	ADD FOREIGN KEY (BUYER_ID)
	REFERENCES BUYER (BUYER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE BUYER
	ADD FOREIGN KEY (BUYER_LGU)
	REFERENCES LPROD (LPROD_GU)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE PROD
	ADD FOREIGN KEY (LPROD_GU)
	REFERENCES LPROD (LPROD_GU)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CART
	ADD FOREIGN KEY (MEM_ID)
	REFERENCES MEMBER (MEM_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE BUYPROD
	ADD FOREIGN KEY (BUY_PROD)
	REFERENCES PROD (PROD_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CART
	ADD FOREIGN KEY (PROD_ID)
	REFERENCES PROD (PROD_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Create Indexes */

CREATE INDEX IDX_ZIPTB_ZIPCODE USING BTREE ON ZIPTB ();



