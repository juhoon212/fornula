# fornula
Spring Framework + JSP 전문가 외주 사이트
<여기다가 우리 도메인적기> 


- FORNUAL은 전문가 외주를 목표로 공급과 수요를 연결해주는 사이트입니다.
FOR + MANAUL의 합성어인 FORNUAL은 카카오, 구글, 네이버 로그인과 같이 간단한 인증 과정을 거쳐 프리랜서, 전문 업체 등의 판매 글을 바탕으로 장바구니 기능, 찜 기능, 리뷰 기능, 카카오톡 공유하기 기능에 더해 카카오페이, KG 이니시스 카드 결제 사용으로 결제를 하는 기능으로 구성되어 있습니다. 

- 검색 기능, 전문가별 랭킹 기능, 전문가의 포트폴리오를 보는 기능, 구매 / 판매 관리를 통하여 일방적으로 소비자 중심의 서비스를 제공하는 평범한 쇼핑몰이 아닌 판매자가 구매자가 될 수도, 구매자가 판매자가 될 수도 있다는 가정하에 양 측 모두에게 풍부한 서비스를 제공한다!는 모토를 가지고 작업에 임하였습니다


- 댓글, 답글 시스템과 QnA 기능의 추가로 여러 번의 피드백이 필요한 FORNUAL의 상품들의 특징을 고려하여 판매, 구매 상황에서의 편의성을 높였으며 페이지를 연결할 때, 사용자의 입장에서 다음 페이지에 어떤 페이지가 있으면 좋을지를 고려해 보다 짜임새있게 페이지 연결을 구현하였습니다


# 프로젝트 소개
크몽을 참고로 만든 사이트입니다


**개발 기간:** 2023년 8월 1일 ~ 2023년 9월 26일


# 기획 의도

이 프로젝트의 주요 기획 의도는 다음과 같습니다:

- 공산품이 아닌 판매자와 소비자의 피드백을 통해 전문가의 능력을 구매하고 판매할 수 있는 외주 사이트를 만드는 것입니다.

- 일반적인 쇼핑몰과 달리 하나의 계정이 판매자와 구매자 역할을 동시에 할 수 있도록 설계하여 많은 데이터베이스 관리와 페이지 설계를 가능하게 합니다.

- 상품 상태를 나타내는 로직 역시 일반 쇼핑몰과 달리 판매자의 계정에서 제작 중, 제작 완료 등과 같은 형태로 나타나도록 제작되었습니다.

이 프로젝트의 핵심 목표는 판매자와 구매자 간의 상호작용을 강화하고 개인 판매자의 능력을 향상시켜보다 다양한 제품과 서비스를 소비자에게 제공하는 것입니다.



# 참여 인원
팀장 : 윤주훈 


- 로그인 관련 기능
- 리뷰 기능
- 상품 관련 기능
- 회원가입


부팀장 : 서수연


- 결제 관련 기능
- QnA 게시판
- 리뷰 기능
- 마이페이지 기능


팀원 : 박하윤


- 상품 관련 기능
- 전문가 페이지 기능
- 검색 기능
- 전문가 랭킹


 팀원 : 조민환


 - 프론트엔드 전반
 - 회원가입
 - 로그인 관련 기능
 - 관리자 페이지


팀원 : 조혜민


- 메인 페이지
- 프론트엔드 전반
- 전문가 페이지 기능
- AWS 서버
- 로그인 관련 기능
- 장바구니
- 공유하기 기능 / 지도 API 기능


# 개발 환경
- Java 11


- JavaScript(ECMA-6)


- tomcat V 9.0


- OAuth2


- Security


- 서버 : AWS


- Database : Oracle DB(11g)


- 템플릿 : bootstrap framework


- 외부 API :


카카오페이 api


KG 이그니스 결제 api


소셜로그인(네이버, 구글, 카카오)api


카카오 공유하기 api


구글 맵 api


# ERD 
https://lucid.app/lucidchart/7aa35c73-1678-4844-9c96-00d91b703d72/edit?viewport_loc=-8762%2C-1383%2C11595%2C6595%2C0_0&invitationId=inv_8e8e90e3-7087-4962-9d8c-8bd40844fee2


이거 수정해야할듯

# Oralcle 11g DB 정의서
[Uploadin--------------------------------------------------------
--  ������ ������ - ������-10��-04-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CART
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."CART" 
   (	"CART_IDX" NUMBER, 
	"MEMBER_IDX" NUMBER, 
	"ITEM_IDX" NUMBER, 
	"ITEM_PHOTO_IDX" NUMBER, 
	"CART_DATE" VARCHAR2(50 BYTE), 
	"CART_STATUS" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table INTEREST
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."INTEREST" 
   (	"INTEREST_IDX" NUMBER, 
	"CATEGORY_IDX_ONE" NUMBER, 
	"CATEGORY_IDX_TWO" NUMBER, 
	"CATEGORY_IDX_THREE" NUMBER, 
	"MEMBER_IDX" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ITEM
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."ITEM" 
   (	"ITEM_IDX" NUMBER, 
	"CATEGORY_IDX" NUMBER, 
	"EXPERT_IDX" NUMBER, 
	"ITEM_NAME" VARCHAR2(100 BYTE), 
	"ITEM_CONTENT" VARCHAR2(3000 BYTE), 
	"PRICE" NUMBER, 
	"ITEM_STATUS" NUMBER, 
	"ITEM_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EXPERT
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."EXPERT" 
   (	"EXPERT_IDX" NUMBER, 
	"MEMBER_IDX" NUMBER, 
	"PHONE" VARCHAR2(50 BYTE), 
	"INTEREST" NUMBER(20,0), 
	"INTRODUCE" VARCHAR2(800 BYTE), 
	"CAREER" VARCHAR2(20 BYTE), 
	"COMPANY_ONE" VARCHAR2(100 BYTE), 
	"COMPANY_TWO" VARCHAR2(100 BYTE), 
	"COMPANY_THREE" VARCHAR2(100 BYTE), 
	"EXPERTFILE_NAME" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table REVIEW
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."REVIEW" 
   (	"REVIEW_IDX" NUMBER, 
	"PURCHASE_IDX" NUMBER, 
	"SCORE" NUMBER, 
	"CONTENT" VARCHAR2(2000 BYTE), 
	"REVIEW_DATE" DATE, 
	"REVIEW_STATUS" NUMBER, 
	"REVIEWFILE_NAME" VARCHAR2(100 BYTE), 
	"ANSWER_CONTENT" VARCHAR2(2000 BYTE), 
	"ANSWER_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PURCHASE
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."PURCHASE" 
   (	"PURCHASE_IDX" NUMBER, 
	"ITEM_IDX" NUMBER, 
	"MEMBER_IDX" NUMBER, 
	"PURCHASE_DATE" DATE, 
	"PURCHASE_STATUS" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."MEMBER" 
   (	"MEMBER_IDX" NUMBER, 
	"ID" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(100 BYTE), 
	"EMAIL" VARCHAR2(40 BYTE), 
	"MEMBER_DATE" DATE, 
	"MEMBER_STATUS" NUMBER, 
	"MEMBERFILE_NAME" VARCHAR2(100 BYTE), 
	"LOGIN_DATE" DATE, 
	"CATEGORY_ONE" NUMBER, 
	"CATEGORY_TWO" NUMBER, 
	"CATEGORY_THREE" NUMBER, 
	"ENABLED" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table AUTH
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."AUTH" 
   (	"AUTH_IDX" NUMBER, 
	"ID" VARCHAR2(100 BYTE), 
	"ROLE" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CATEGORY
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."CATEGORY" 
   (	"CATEGORY_IDX" NUMBER, 
	"LARGE" VARCHAR2(50 BYTE), 
	"SMALL" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table STATUS
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."STATUS" 
   (	"STATUS_IDX" NUMBER, 
	"STATUS" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PHOTO
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."PHOTO" 
   (	"PHOTO_IDX" NUMBER, 
	"ITEM_IDX" NUMBER, 
	"ITEMFILE_NAME" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PAYMENT
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."PAYMENT" 
   (	"IMP_UID" VARCHAR2(100 BYTE), 
	"MERCHARNT_UID" VARCHAR2(100 BYTE), 
	"PAY_DATE" DATE, 
	"USERID" VARCHAR2(100 BYTE), 
	"AMOUNT" NUMBER, 
	"ITEM_IDX" NUMBER, 
	"STATUS" VARCHAR2(20 BYTE), 
	"PURCHASE_IDX" NUMBER, 
	"SALES_IDX" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table BOARD
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."BOARD" 
   (	"BOARD_IDX" NUMBER, 
	"BOARD_TITLE" VARCHAR2(100 BYTE), 
	"BOARD_CONTENT" VARCHAR2(3000 BYTE), 
	"ID" VARCHAR2(50 BYTE), 
	"BOARDFILE_NAME" VARCHAR2(100 BYTE), 
	"BOARD_STATUS" NUMBER, 
	"VIEW_CNT" NUMBER, 
	"REG_DATE" DATE, 
	"COMMENT_CNT" NUMBER, 
	"UP_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SALES
--------------------------------------------------------

  CREATE TABLE "FIVEJO1234"."SALES" 
   (	"SALES_IDX" NUMBER, 
	"ITEM_IDX" NUMBER, 
	"SALES_DATE" DATE, 
	"SALES_STATUS" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into FIVEJO1234.CART
SET DEFINE OFF;
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (251,101,31,29,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (252,1,32,30,'23/09/29',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (249,101,81,101,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (214,25,14,10,'23/09/25',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (245,193,14,10,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (246,172,14,10,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (247,172,16,16,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (161,25,12,9,'23/09/23',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (239,1,14,10,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (241,101,32,30,'23/09/26',1);
Insert into FIVEJO1234.CART (CART_IDX,MEMBER_IDX,ITEM_IDX,ITEM_PHOTO_IDX,CART_DATE,CART_STATUS) values (183,183,14,10,'23/09/25',1);
REM INSERTING into FIVEJO1234.INTEREST
SET DEFINE OFF;
REM INSERTING into FIVEJO1234.ITEM
SET DEFINE OFF;
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (16,2,13,'���� ���� ��ǰ ������ ���� �޽��ϴ�','�پ��� ��ǰ�����ΰ� ȿ������ �������� �������� ���� �������� ���� �ּ��� ���ϰڽ��ϴ�.

���۰�����
�ֹ�
->
���
-> 
�þ�����
-> 
�����۾�
-> 
����Ȯ��
->
������������
->
�Ϸ� �� ����Ȯ��
�� �������� ����˴ϴ�',30000,1,to_date('23/08/30','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (32,5,13,'������ �ƴ� �ʼ� / ���� ���� ��� ����ũ��','�����Ⱓ ���� ������ �غ��ϰ� ���� ���� �ؾ��� �����ϴ� ���� ��������Դϴ�
���� �� ������ ��� ����ũ���� �޾ƾ� �ϴ� ���� �ƴ����� �׸�ŭ �������� �ڸ��� �غ��� ���� ������ �ֱ� ������ 
������ũ���� ������ ���ػ��е��� �ڽŰ� ��ġ�� �߾��� ���� �λ��� �ɾ��ְ� ���ø� �˴ϴ�!

�������� 30~40�� ���� �ҿ�ǰ�,
�������� 1�ð� 20��~1�ð� 30������ �ҿ�˴ϴ�

������
50000��
������
70000��',50000,1,to_date('23/09/05','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (33,10,13,'�� ������ ��ȭ�� �����϶�!','���� �������� �������� ����Ͻ��� ���� ������̰� �Ǿ� �帮�ڽ��ϴ�

������ ���� ������ ��
031-123-1234
qkr@naver.com

�߱� ���� ������ ��
031-123-1233
gk@naver.com

�Ϻ� ���� ������ ��
031-123-5678
dbs@naver.com

���� ���� ������ ��
031-123-5677
95@naver.com

�̱� ���� ������ ��
031-123-5679
qkrgkdbs@ajou.ac.kr

������ ������, ���뺰, �Ը𺰷� �����ϸ� 
��� �� ��Ȯ�� �� ������ �ο��˴ϴ�',2000000,1,to_date('23/09/05','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (34,8,13,'��ġ ���� ���� ����, ���������� �ñ⼼��!','���μ�����, ����� ��� �� �� �ʿ��� ����? ����, ȸ�縦 �ٴѴٸ� ���ݰ����� ũ�� �ʿ� �����ϴ�. ȸ�翡�� ���������� ���� ��� �������ֱ� �����Դϴ�. ������ ���λ���� �����ϸ� ���ݰ����� ��ǥ�Բ��� ���� �ϰų�, �����縦 ���� �����ؾ� �մϴ�',150000,1,to_date('23/09/05','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (35,9,13,'SNS ȫ�� ������ ���� ��ü"�Ķ�̵��"','�¶��� ȫ�������ø� ���ؼ� SNS�÷��������� �ʼ����Դϴ�. SNSȫ���������� ȿ�������� �ϱ� ���ؼ��� �پ��� �Ҽȹ̵� ����� Ȱ���ؾ� �մϴ�. (��)�Ķ�̵��� ȿ������ �Ҽȸ������� ü�������� �����ϰ� �ֽ��ϴ�~~ Ȥ�� SNS ȫ���� �ʿ����� �����Ű���?',10000,1,to_date('23/09/05','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (36,9,13,'�Բ� �����ϴ� ��� LinkedIn','
���������� �ŵ�Ÿ�ӽ� [ MAD Times ]
2020�� 8�� ��� ��

"NPR�� PR, ����, ������ �� �پ��� �о��� Ŀ�´����̼� ���������� �� ���۵� ȫ��ȸ���, ���� â�� 5������ ������ ���߰߱� �Ż�ȸ�硯�̴�.
�ܼ��� ���»� �ƴ϶� �װ��� ���� �� ������Ʈ ���۷����� ���캸�� �� ǥ���� ���ذ� ����.
?
â�� ���� �����, ����������, ��ȭü�������� �� ������ ���α���� ����, SK�ڷ���, �Ｚ����, ��ȭ, �λ� ��  ������ ������ ������Ʈ�� �����ϸ� ������ �ָ��� �޾Ҵ�.
�߼�, �߰߱��, ��ŸƮ������ 100���� �̻��� �����縦 �ʱ� 3�⸸�� �����ϸ� �ʰ��� ������ �̷��.
?
Ư��, ������ͼ�, BOF(�λ���ƽþ��佺Ƽ��), ĭ���̾����(ĭ������in�ѱ�), �λ걹��������(ADSTAR) ��  ������ ��������� ȫ�� �Ѱ� ����ȸ��� ���� �����Ǳ⵵ �ϴ� �� �۷ι� ȫ���� ���ٸ� ������ ������ �ִ�."


���� ���� �̵�� ���������� ȫ��������
�������� ������ ȫ�����񽺸� �����մϴ�.
PR Consulting
IMC/ MPR
Media Relations
Media Commerce
Crisis Management
Event/ Promotion


�Բ��ϴ� ���
[
����������
�ѱ���������
ī���ΰ�
�ڽ��ΰ�
��������Ʈ-�ΰ�
winkstone-1
�ӽ�Ʈ�շΰ�
�Ǿ��1
vatech
ķ��
����ũ�ظ���Ʈ-�ΰ�
��ȭ����Ʈ-800
��ȭ����
����Ƽ
��������
�ѱ��������ð���-1
�ΰ�_��57ȸ-�ѱ��μӿ�������-��-��23ȸ-����û�ҳ�μӿ�����_1
�帲�÷���2
����ڵ���
tmon
�����̽� �ΰ�
LG���̾���ũ �ΰ�
ssn
GM
�ø�ũ �ΰ�
[���� 1] ������� �ΰ�
���˼���Ʈ �ΰ�
���ξ�����
�������� �ΰ�
��Ƽ_�����ΰ�
Mobility2021
CI ������2__������ũ��
image (4)
re_GOPIZZA
�н�Ʈķ�۽�
schulstad
Ʈ������
�������̿���
���ڷ���-�ΰ�
��ü��
...
]',1000000,1,to_date('23/09/05','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (38,4,13,'�߱��� -> ���� ���� �ص帳�ϴ� ','�ܱ���<>�ܱ��� �����̴� ����
�������� ������ �����Ͻô� ��쵵 �����ϴ�!


����ž�ڸ��ƴ�
�̱� ������ ����ž�ƽþ��� �ѱ������Դϴ�!
�ѱ��� �̱��� �߽����� �߱�, �Ϻ�, �Ұ����ƿ� ���簡
��ǰ� ������.

������ ���簡 ��ǰ� �־
��ǰ���� �ո����� ������� �߿������� �����ϴ�ϴ�!',20000,0,to_date('23/09/06','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (81,7,13,'[25�� ���] ����� ���� ���� ����','��������� ������ ��������� ���� ����û�� ������� �ο򿡼� ����ڰ� ������ ��ġ�� ���� �� �ֵ��� �����ϴ°̴ϴ�. ���� ������ź�� ����ؼ� �̸� ������ �� �ֵ��� �ε���� ¥�ִ� ������ �ð� �ֱ⵵ �� ���� �������Դϴ�',5000000,1,to_date('23/09/15','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (7,2,1,'�ǿ����� ���� ������ �ص帳�ϴ�.','

����� �ֻ�� �������� ��ü���濡�� 100% ���������� ���񰡱� ������ 

�ϰ� �ֽ��ϴ�.

�̹� ���۵Ǿ� �ִ� ���� �߿��� �����Ե��� ���Ͻô� ��ǰ�� �ٷ� �ֹ��ϼŵ� ������,

������ ���۵Ǿ� �ִ� ������ �ܼ��� �����̳� ����� �����Ͻðų�,

�Ϻ� �������� �����Ͻ� ���� �ְ�

�ƿ� ó������ �������� ��û��� ������ �ص帮�⵵ �մϴ�.

�⼺ ��ǰ��ó�� ��ǰ�� �������� �Ǹ��ϴ� ���� �ƴ�

���񰡱� �ֹ��� ���ö����� ������ �ص帮�� ������ ������ �ý����Դϴ�.',50000,0,to_date('23/08/29','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (8,9,1,'�����ϰ� sns ������ �ص帳�ϴ�.','3-SNS ����༭�� [U"s Marketing]


�ٻ� �һ���� �� �߼ұ�� �����е��� ����Ͽ�

�� 4ȸ ī�崺�� ������ ��ü���� ������ ���ε带 ����,

3-SNS ( Instagram / Facebook / Blog ) ������ ������� Ű��� ����

�������� ���� �۾����� �Բ� �����ϴ� ��Ż �������� ���� �����Դϴ�.



[�ν�Ÿ�׷�]

- �� 4ȸ ������ ���ε� (��ü���� ī�崺��)

- �±ױ�� Ÿ���� �ȷο� �����۾�

- �����͸� ���� ��ǥ �ؽ��±� ����


[���̽���]

- �� 4ȸ ������ ���ε� (��ü���� ī�崺��)

- �������� ������ ���� �� ����

- �����͸� ���� ��ǥ �ؽ��±� ����


[���̹� ���α�]

- �� 2ȸ ���������ε� (��ü���� ī�崺��)

- ������ �ٽ� Ű���� ����

- ���α� Ȩ�������� ������ �۾�


',70000,1,to_date('23/08/29','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (9,3,1,'���� ��� ���͵帳�ϴ�.','���� ��� ���͵帳�ϴ�.',60000,1,to_date('23/08/29','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (10,4,1,'�߱��� ����/����� �ص帳�ϴ�','�� HSK 6�� ����,
�߱� ���� 11�� ����� �����ڷ� ���� ����, ������ �ؼ� ������δ� �Ұ����� ����ü �� ��Ȳ�� �´� ǥ������ ����ϰ� �����ص帳�ϴ�  
',6000000,1,to_date('23/08/29','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (30,9,23,'������ ȫ���ص帳�ϴ�','�ν�Ÿ ���̹� ���α� ����
�Խñ� �Ǵ� 23����',230000,0,to_date('23/09/03','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (39,7,13,'������ �������� �� �̻� ���� ��','��������� ������ ��������� ���� ����û�� ������� �ο򿡼� ����ڰ� ������ ��ġ�� ���� �� �ֵ��� �����ϴ°̴ϴ�. ���� ������ź�� ����ؼ� �̸� ������ �� �ֵ��� �ε���� ¥�ִ� ������ �ð� �ֱ⵵ �� ���� �������Դϴ�.


������ ���� ��ġ ���� ��ó�� �����ϸ� ����Ǵ� �ڱ� ���� ���ü�� ���� ū ������ �帮���� ����ϰڽ��ϴ�',1254000,0,to_date('23/09/06','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (40,2,13,'Simple Is Best','�� �귣���� ���� �ڽ��� ���� �غ��� �ʹٸ� �δ� ���� ������ �ּ���.

031-155-1565

qkrgkdbs@qkrgk.com

*****
�ϻ� ���� ��ǰ,  ���� ��ǰ ���� ������ 
*****',80000,0,to_date('23/09/06','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (104,4,13,'�߱�������, ���� ���� �����ְ� ��Ȯ�� ����','�߱��� ����� 12���� ȭ���Դϴ�

�߱��� ���� ����� 9�⿡ ���ϸ� �ѱ���, �߱��� ��� �𱹾ŭ �����մϴ�

�߱��� �ڸ��� �ʿ��� ����, �ѱ��� �ڸ��� �ʿ��� �߱� ���� �ڸ� �����ص帳�ϴ�',140000,1,to_date('23/09/19','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (12,3,1,'���� ��ǰ ���� ���帳�ϴ�','���� ��ǰ ���� ���帳�ϴ�',1000,1,to_date('23/08/30','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (14,1,13,'����� �ǹ��� ����� �帳�ϴ� ','[����/������/�׷���][�Ϸ���Ʈ/����׶���/...]

���ϴ� �̹����� �����ϰ� �����ϼ���! ~ 

���̽���/�ν�Ÿ�׷�/���α� � �ʿ��� ���� ����Ϻ���

���ȭ��, ����׶���, �Ϸ���Ʈ���� 

�ǻ�Ȱ���� Ȱ�밡���� �پ��� ����ǰ���� �����ص帳�ϴ�! 

*���ǻ���* 
- ���ݸ����� ������ �Ұ����մϴ�
- ������ JPG, PNG ���·� �����մϴ�
- ���۹��� ���۱��� �����ڿ��� �絵�ǳ� �۾����� �������� ��� ������ ��Ʈ�������� Ȱ���� �����մϴ�
- �ϼ������� 2�� �������� ���մϴ�
- �ʻ���� �ִ� �̹����� �ش� �ʻ���� ������ �������ڿ� ���ǰ� �� �ÿ��� ������ �����մϴ�
',200000,1,to_date('23/08/30','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (31,9,13,'�ı⸦ �θ��� SNS �̺�Ʈ!','SNS �ı� �̺�Ʈ�� �˷��� �������� �������ϴ�.
�����Ͽ콺������ �̺�Ʈ ȫ�� �����Ͱ� 1�� 1,600������!
������ ��� ���� ���� ������ ���� �� �־��~',20000,1,to_date('23/09/05','RR/MM/DD'));
Insert into FIVEJO1234.ITEM (ITEM_IDX,CATEGORY_IDX,EXPERT_IDX,ITEM_NAME,ITEM_CONTENT,PRICE,ITEM_STATUS,ITEM_DATE) values (76,2,13,'�ð� Ŀ���͸���¡ ���� ��ü [�����̳�:������]','���� ȸ�߽ð� �����Ʈ�� ���ϼ̴ٰ���?

��..�ٵ� ���̽��� �ƽ��ƽ��ϰ� �ȵ�� ���ٰ���?

Ȥ�� ��� ���̰� �ȸ¾Ƽ� ������ ���µ� �ٸ� ����� ���ٰ���?



���̽��� �������ִ� ��ü�� �ֽ��ϴ�.



���μ����� �ִ� ''������''���� �����մϴ�.

���̽� ������ ���ؼ��� �������� ��ü�̰� �ٸ��������� �̷��۾��� ���� �ȹ޾� �̴ٰϴ�.

***
�ڼ��� ��ǰ ������ ��� �� ���� �˴ϴ�
***',100000,1,to_date('23/09/11','RR/MM/DD'));
REM INSERTING into FIVEJO1234.EXPERT
SET DEFINE OFF;
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (11,35,'01056123598',4,'�Ұ�
//�߱� ���� �����б����� ��.��.�� ����  
//������� ����
//15���̻� �������ְ���
//����������� �ؿܿ����� �߱������ �Ѱ�.(5��)
//10���̻� �߱��� ����
//���� �Ⱝ
//�����뿪��
//��) �߱�����п� ����','7��','�߱�����п�','�߱� ���� �����б�',null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (13,25,'01012331332',5,'�ȳ��ϼ��� �������Դϴ�
�ȳ��ϼ��� �������Դϴ�
�ȳ��ϼ��� �������Դϴ�
�ȳ��ϼ��� �������Դϴ�
�ȳ��ϼ��� �������Դϴ�','4��','Vina','Viettel','ALS','4ab4d73f-ad82-4b78-8fd0-36a7b20e6b8d_final.pdf');
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (77,95,'010-1111-1111',4,'�ȳ��ϼ���? �߱��� ���� �������Դϴ�.','3�� ','�߱����п�',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (82,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (88,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (89,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (92,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (141,101,'010-7129-9120',1,'�ȳ��ϼ���','2',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (1,1,'010-8287-9856',3,null,'3����������',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (126,192,'010-2303-5454',1,'�ȳ��ϼ��� �׷��� �������Դϴ�.','3��','g�׷���',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (140,172,'010-4444-4445',1,'�ȳ��ϼ��� ������ ���Դϴ�.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (15,17,'01012345678',8,'�ȳ�','1��',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (113,173,'010-2303-5454',1,'�ȳ��ϼ��� ��������~~~','7��',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (134,198,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (127,193,'010-5612-3598',1,'�ȳ��ϼ��� �׷��� �����̳��Դϴ�.','7��','g�׷���','l�׷���','s�׷���',null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (139,202,'010-4444-4445',1,'������ ���Դϴ�.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (20,61,'01025634523',1,'�ȳ��ϼ���','1��','����Ƽ��',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (23,65,'20230407',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (3,23,'010-4444-4444',1,'�ȳ��ϼ���^^  �ΰ��� �������Դϴ�. 
����������,�̼�����,����׷���  �� �����о��� ���������� �� ���� �ΰ����� �����ְ� Ʈ�����ϰ� ����� �帳�ϴ�.^^
ù°. ���Ͻô� �ΰ��� �ͱ���̰� ģ���� �ϳ��ϳ� �δ���� ���� �ص帱����~
��°. �׻� �ż��ϰ� ��Ȯ�ϰ� ����� �帳�ϴ�~��°. ����ó�� ���ɼ��ǲ� ����� �帮�ڽ��ϴ�~','1��','�ڵ�','������','����Ƽ��',null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (32,64,'606-0606-0606',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (133,174,'010-8287-1234',1,'�ڱ�Ӱ�','3',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (137,199,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (47,75,'051-9195-1511',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (48,75,'051-9195-1511',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (57,81,'010-2265-2562',1,'ewfwefew','2',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (58,81,'010-2265-2562',1,'ewfwefew','2',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (59,81,'010-2265-2562',1,'ewfwefew','2',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (60,82,'010-7129-9120',1,'dghgfhfghgfhfghgfhgfh','1',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (61,82,'010-7129-9120',1,'dghgfhfghgfhfghgfhgfh','1',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (64,83,'010-7129-9120',1,'�ȳ��ϼ���',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (67,86,'010-7129-9120',1,'�ȳ��ϼ���.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (68,86,'010-7129-9120',1,'�ȳ��ϼ���.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (69,87,'010-7129-9120',1,'dkssudgktpdy.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (70,87,'010-7129-9120',1,'dkssudgktpdy.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (71,88,'010-2265-2562',1,'�Ƴ礷',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (72,88,'010-2265-2562',1,'�Ƴ礷',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (74,90,'010-7129-9120',1,'gdfgd',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (76,94,'010-2304-9321',1,'dksldklfj',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (94,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (128,194,'010-0505-0505',1,'�ȳ��ϼ��� ������ �������Դϴ�,','3��','���׷���',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (129,185,'010-2938-4848',1,'������ ���ε��Դϴ�.',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (138,201,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (75,91,'010-2304-9321',1,'dfsdfdsf',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (14,31,'01071299120',9,'�ȳ��ϼ��� �������Դϴ�.

- �پ��� ���� ��� -

[������ ��ǰ]
���α� ����
���α� �ǹ���,25�� ����ȭ����
���α� ���ġ ����Ʈ����
���÷�� ���ڴ�
������Ʈ SEO','3��','���ġ',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (73,89,'010-2265-2562',1,'dkssud',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (91,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (121,168,'010-1234-5687',1,'�ȳ��ϼ���','2',null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (123,183,'010-2342-3043',1,'�ȳ��ϼ���','1','2',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (125,191,'010-5612-3598',1,'�ȳ��ϼ���','7��','�������',null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (17,34,'01077777777',5,'��¼����¼��','30��','û�㵿�̿��','�б����̿��','���ﵿ�̿��',null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (18,50,'01071294512',4,'�ȳ��ϼ��� ���� ������ �Դϴ�.','4��','�߱�','�߱���','�߱������',null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (19,54,'010',5,null,'3','i','f','s',null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (46,74,'002-020-2022',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (49,76,'010-2265-2562',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (50,76,'010-2265-2562',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (51,77,'010-7129-9120',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (52,77,'010-7129-9120',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (62,83,'010-7129-9120',1,'�ȳ��ϼ���',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (63,83,'010-7129-9120',1,'�ȳ��ϼ���',null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (83,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (85,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (86,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (87,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (90,23,'010-4444-4445',1,null,null,null,null,null,null);
Insert into FIVEJO1234.EXPERT (EXPERT_IDX,MEMBER_IDX,PHONE,INTEREST,INTRODUCE,CAREER,COMPANY_ONE,COMPANY_TWO,COMPANY_THREE,EXPERTFILE_NAME) values (132,195,'010-2020-2020',1,'������ ���Դϴ�.',null,null,null,null,null);
REM INSERTING into FIVEJO1234.REVIEW
SET DEFINE OFF;
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (8,26,5,'test',to_date('23/08/30','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (13,37,5,'��ǰ �����մϴ�^^',to_date('23/08/31','RR/MM/DD'),1,null,'efef',to_date('23/09/01','RR/MM/DD'));
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (61,37,3,'good',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (65,37,2,'����',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (17,44,5,'�����մϴ�22',to_date('23/08/31','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (67,105,5,'�����մϴ�',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (7,26,5,'����',to_date('23/08/30','RR/MM/DD'),1,null,'��',to_date('23/09/07','RR/MM/DD'));
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (62,25,3,'good',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (63,105,4,'���ƿ�',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (14,29,0,'��',to_date('23/08/31','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (16,25,5,'�����ϴ�',to_date('23/08/31','RR/MM/DD'),1,null,'g',to_date('23/09/06','RR/MM/DD'));
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (64,29,3,'good',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (19,46,5,'�ȳ��ϼ���~',to_date('23/09/01','RR/MM/DD'),1,null,'�ȳ��ϼ���',to_date('23/09/07','RR/MM/DD'));
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (20,31,5,'qqq',to_date('23/09/02','RR/MM/DD'),1,null,'qqq',to_date('23/09/02','RR/MM/DD'));
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (21,34,5,'qqq',to_date('23/09/02','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (23,47,5,'��¥�Դϴ�',to_date('23/09/03','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (66,29,2,'������',to_date('23/09/26','RR/MM/DD'),1,null,null,null);
Insert into FIVEJO1234.REVIEW (REVIEW_IDX,PURCHASE_IDX,SCORE,CONTENT,REVIEW_DATE,REVIEW_STATUS,REVIEWFILE_NAME,ANSWER_CONTENT,ANSWER_DATE) values (11,30,5,'�����մϴ�',to_date('23/08/31','RR/MM/DD'),1,null,'efef',to_date('23/09/08','RR/MM/DD'));
REM INSERTING into FIVEJO1234.PURCHASE
SET DEFINE OFF;
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (35,14,54,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (25,8,1,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (26,9,1,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (34,12,54,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (29,14,1,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (37,16,1,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (101,76,101,to_date('23/09/16','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (102,76,101,to_date('23/09/16','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (164,76,1,to_date('23/09/26','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (44,14,59,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (105,81,101,to_date('23/09/16','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (31,16,54,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (32,12,54,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (38,14,1,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (46,10,49,to_date('23/09/01','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (47,14,65,to_date('23/09/03','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (48,14,1,to_date('23/09/06','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (61,35,1,to_date('23/09/08','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (106,81,101,to_date('23/09/16','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (123,14,1,to_date('23/09/21','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (166,31,101,to_date('23/09/26','RR/MM/DD'),4);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (21,7,31,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (30,12,1,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (181,31,101,to_date('23/09/26','RR/MM/DD'),4);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (162,35,168,to_date('23/09/25','RR/MM/DD'),6);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (165,14,174,to_date('23/09/26','RR/MM/DD'),4);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (22,14,31,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.PURCHASE (PURCHASE_IDX,ITEM_IDX,MEMBER_IDX,PURCHASE_DATE,PURCHASE_STATUS) values (107,81,23,to_date('23/09/18','RR/MM/DD'),2);
REM INSERTING into FIVEJO1234.MEMBER
SET DEFINE OFF;
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (1,'sgwonbe212','$2a$10$NBMLY7xehIsKxgB3qTJ57.aElHwvtOYGC0XYfC4.VVBKJv0mObNrK','ws5502@naver.com',to_date('23/08/25','RR/MM/DD'),2,null,to_date('23/08/25','RR/MM/DD'),3,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (37,'juhoon212','$2a$10$se4IQEOLZMPRX10U9qOwKe.zg2Z0VOTMMrc3GSMUMRvTx01DRSQB6','sgwonbe112@gmail.com',to_date('23/08/30','RR/MM/DD'),0,null,to_date('23/08/30','RR/MM/DD'),2,6,4,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (51,'123','$2a$10$3Q2WVFKdYVT2WIJK.KTA/e3KNjkCgjvkFzh9MoBiXTYrszWy1tx0q','123@123',to_date('23/08/31','RR/MM/DD'),1,null,to_date('23/08/31','RR/MM/DD'),3,7,7,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (57,'qkrgkdbs1995','$2a$10$eWKeJfNSZRU3z2F5HDUKkOc.7lbtERz7XxRmWypRdm1lSfPa7goBC','qkrgkdbs@ajou.ac.kr',to_date('23/08/31','RR/MM/DD'),1,null,to_date('23/08/31','RR/MM/DD'),1,3,8,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (66,'gpals4431','$2a$10$L8kq5P0JCqcpppNphtuFeO0ntqLP.6PReBbt5jBhlYapNz/uDdDsq','gpals44@itwill.com',to_date('23/09/05','RR/MM/DD'),1,null,to_date('23/09/05','RR/MM/DD'),7,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (82,'abcd123456','$2a$10$HySH5xruPNwTgFgdgtp74ezw03D5Ei5A04YyZUkMTaapEyvR8gQ6a','asd123@itwill.com',to_date('23/09/07','RR/MM/DD'),2,null,to_date('23/09/07','RR/MM/DD'),5,1,5,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (95,'qq9','$2a$10$WhU10Gt1Sz.mUZaT7L.M8erfLTcNJslm.GdpY06H9QYgrSLHUifL6','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (184,'google_106537143813673969419','$2a$10$SNZry8J77cRNnBDUs0BUn.Ixuiq.CuysoNLTJHTkxNoiXre3y1lC6','jirun0113@gmail.com',to_date('23/09/25','RR/MM/DD'),1,null,to_date('23/09/25','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (192,'pp9876','$2a$10$NT1rF3shXRQ6CqvQ28z.eeNTi2EqOjUFaQo.M/KuVFsKrbjJur1OG','pp9876@naver.com',to_date('23/09/25','RR/MM/DD'),2,null,to_date('23/09/25','RR/MM/DD'),1,5,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (194,'google_111156989947541972899','$2a$10$2ZoUh77kSicmgqT0fsaxeOLehKZU5jIHtFwTUiFfJF9456eWgn5e2','chefcho22@gmail.com',to_date('23/09/26','RR/MM/DD'),2,null,to_date('23/09/26','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (195,'google_113135032411802372127','$2a$10$FRLI9bFy84p20JOZnWlrs.174z82T9i8DQ9e8p.NoXso9xF0uAsQi','findusertest@gmail.com',to_date('23/09/26','RR/MM/DD'),2,null,to_date('23/09/26','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (28,'assdf1234','$2a$10$sqF4I1Dk7rfYDH73OXxB0uLb1DPXwQscdgWFqzO2A4VNKOrlqnEGq','asdf1234@gmail.com',to_date('23/08/29','RR/MM/DD'),1,null,to_date('23/08/29','RR/MM/DD'),5,7,9,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (31,'789ssy','$2a$10$RiXEC8QehZbxcDjtT7nPk.R47FFnDK8R8vGMyMNaU/MFsn9jw7Cf2','123@naver.com',to_date('23/08/29','RR/MM/DD'),2,null,to_date('23/08/29','RR/MM/DD'),10,10,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (23,'asd123','$2a$10$CdLg5p0QA95OV.AnJPf4luYJLXmPbxYoMGfPeWkiGLxSnSvlngfMW','asd123@itwill.net',to_date('23/08/28','RR/MM/DD'),2,null,to_date('23/08/28','RR/MM/DD'),10,10,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (33,'111','$2a$10$P4RCj7hMUnMVdvcZzMhZ3epwtZO99k5EpVX3VYA96IzekCdqs7NLe','123@123.COM',to_date('23/08/29','RR/MM/DD'),0,null,to_date('23/08/29','RR/MM/DD'),6,8,2,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (173,'google_117990942679869560763','b6cf939e-fa29-4e68-a4a6-10c0c2546049','wegpals@gmail.com',to_date('23/09/23','RR/MM/DD'),2,null,to_date('23/09/23','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (191,'pp1234','$2a$10$QiXsp1.DLTE10dBj4mx6fuO2GCQz5Kh3bDJFCTflLZ0CWH/4USLhW','pp1234@naver.com',to_date('23/09/25','RR/MM/DD'),2,null,to_date('23/09/25','RR/MM/DD'),3,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (56,'eee','$2a$10$3fMUfaOlCix8ovgSeHlt3.o5/gz/uDr4AiU8sY2IA344W.1uAlVpK','eee@eee',to_date('23/08/31','RR/MM/DD'),0,null,to_date('23/08/31','RR/MM/DD'),1,7,9,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (59,'hi123','$2a$10$xzq9i2ifv22rSUewuKxgIe.5TuyLX9O4ufwb2b1SRcW.Q.kHFygtG','hi@naver.com',to_date('23/08/31','RR/MM/DD'),1,null,to_date('23/08/31','RR/MM/DD'),3,1,5,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (60,'hi212','$2a$10$OH3U9Jo9Agc4DCHgLe5gee21qKeNinCi.JwW9z.tGM6aymPR8imym','hi212@naver.com',to_date('23/08/31','RR/MM/DD'),1,null,to_date('23/08/31','RR/MM/DD'),5,5,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (68,'testesttest','$2a$10$H5WkWgo1lg4DuzhBTJKbPOfoUMOocEHIvRmSioTXzYxweCBHcpExW','testtettest@naver.com',to_date('23/09/05','RR/MM/DD'),1,null,to_date('23/09/05','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (198,'ii12345','$2a$10$i9U26j/m4CxZ1/Xr.PLrlOLCepnjnbDWf4BJoVbUgb3UtoDFH5FuK','ii123@itwill.com',to_date('23/09/26','RR/MM/DD'),2,null,to_date('23/09/26','RR/MM/DD'),1,5,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (193,'oo1234','$2a$10$1lMbAL6uFKcHxlXVYAWaveylX.pnipaDgSM842ro0rejPO/27p5We','oo1234@naver.com',to_date('23/09/25','RR/MM/DD'),2,null,to_date('23/09/25','RR/MM/DD'),1,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (202,'kakao_��ȯ','$2a$10$lH3FPba09RE4aijWLtPHxejWQUTQ0TZosTv7WiP8I18jZeTQEXVQ2','chefcho22@gmail.com',to_date('23/09/26','RR/MM/DD'),2,null,to_date('23/09/26','RR/MM/DD'),11,11,11,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (13,'qwer1234','$2a$10$nXwvYxtrgFdJHMavvEtIQu8QRCAdPt7IPRywSKwxB96rOjqbCZif2','qwer@qwer.qwer',to_date('23/08/27','RR/MM/DD'),0,null,to_date('23/08/27','RR/MM/DD'),2,8,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (16,'abc123','$2a$10$mIn1Tq7.1SyWgOIw5bVNouYEjW16qkgGa8WFdy27yom.da.rNG6A2','abc123@itwill.com',to_date('23/08/27','RR/MM/DD'),9,null,to_date('23/08/27','RR/MM/DD'),10,10,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (24,'ws5501','$2a$10$xAaLdoygvNbDl3S1gyN4GudeboUwiqq0h4qJnxAN9eLGE9N85e.w2','sgwonbe212@gmail.com',to_date('23/08/28','RR/MM/DD'),1,null,to_date('23/08/28','RR/MM/DD'),1,6,4,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (25,'qkrgkdbs95','$2a$10$h1kg4TrYHfsK5ECVjOvE0OqAopCC5D18Ax8bI.ZoyPzJ3nWmY6iVq','qkrgkdbs@ajou.ac.kr',to_date('23/08/29','RR/MM/DD'),2,null,to_date('23/08/29','RR/MM/DD'),10,10,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (32,'123123','$2a$10$7kka8ud/SC59cSUyA.MUgOZNvSHo4AR88uo7cwyEs5I/9G3m8AGES','qwe123@naver.com',to_date('23/08/29','RR/MM/DD'),0,null,to_date('23/08/29','RR/MM/DD'),4,8,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (34,'zxcv1234','$2a$10$FoDDZa9wGKMm4sL40awweOTDV9CjfsTzC8rkhqB6qPAmtha7aw.CS','asdf@asdf',to_date('23/08/29','RR/MM/DD'),0,null,to_date('23/08/29','RR/MM/DD'),4,10,7,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (35,'qwe123','$2a$10$2xZ.CXmI2VjRdXC2UyVhG.52x156xUOdQt28pknov.U4QGUE2Pc.u','qwe123@qwe.net',to_date('23/08/29','RR/MM/DD'),1,null,to_date('23/08/29','RR/MM/DD'),1,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (38,'zxc123','$2a$10$RUWM04OJ4OnHFUVzuMRF2uWMrF3mAONFv1DTw4cjGnkrYsJVa70DS','zcx@naver.com',to_date('23/08/30','RR/MM/DD'),1,null,to_date('23/08/30','RR/MM/DD'),4,6,6,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (49,'testtest','$2a$10$Thy7UKFWV7MMyW4/GOPTl.VgzhKdcH4z7zYCc0eEIWDtxmyIO/5ry','test@naver.com',to_date('23/08/31','RR/MM/DD'),1,null,to_date('23/08/31','RR/MM/DD'),1,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (53,'qwer1234','$2a$10$v2lxGYJkgk9HVwIJlrjk0.8rZ6YHShc5ezL32gpZJOr7xg5JRp.iW','qwer1234@naver.com',to_date('23/08/31','RR/MM/DD'),0,null,to_date('23/08/31','RR/MM/DD'),1,3,5,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (54,'qqq','$2a$10$QSvnlEUegMkgwByzMEGqt.ATGGt5koZueE9cDX5s0V7rPfnRWnhDm','qqq',to_date('23/08/31','RR/MM/DD'),2,null,to_date('23/08/31','RR/MM/DD'),3,7,5,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (174,'kakao_������','4645c2ba-21f6-4d3a-8775-8ded61334bf3','ws5503@naver.com',to_date('23/09/23','RR/MM/DD'),2,null,to_date('23/09/23','RR/MM/DD'),11,11,11,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (61,'dfg123','$2a$10$RyyI0v77CxuXfDsfEgh0yu72qaeEzCLclmqFSMfAcR.5IaVPomLMW','dfg123@naver.com',to_date('23/08/31','RR/MM/DD'),0,null,to_date('23/08/31','RR/MM/DD'),3,5,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (62,'qqq','$2a$10$i/0Vdt1ZVJRdXbml/gDj1OUCYqlCViZagEOHgvJ3tdEvChgEhvkSO','qqq',to_date('23/09/02','RR/MM/DD'),1,null,to_date('23/09/02','RR/MM/DD'),5,7,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (63,'qqqq','$2a$10$gGL1eNrB4ireeqm9NdXJjO196AYMKrmbnZw7pSa/lqn6gGjGmrktm','qqqq',to_date('23/09/02','RR/MM/DD'),1,null,to_date('23/09/02','RR/MM/DD'),5,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (64,'gpals44','$2a$10$GZ2.8PGVEyNsQ2HjPaSo9./rS5LmL6GC4hXtWNT7xFTC3j8N987xi','gpals44@itwill.com',to_date('23/09/03','RR/MM/DD'),2,null,to_date('23/09/03','RR/MM/DD'),5,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (65,'whalsghks','$2a$10$9z9PPH9L1TTTBpbwsEnrjuHevmingMFYqpiJceId0nUHGQVE2yR0y','����',to_date('23/09/03','RR/MM/DD'),0,null,to_date('23/09/03','RR/MM/DD'),8,2,6,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (67,'������','$2a$10$IQiPBTrhmFZnDz8LBpnm4ur.KpNdtPVbmpBhNtTXSz5MapKxC2WPq','yangjung0326@gmail.com',to_date('23/09/05','RR/MM/DD'),1,null,to_date('23/09/05','RR/MM/DD'),3,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (79,'aaa234','$2a$10$Ix//el3M0SoJ8LP9b9ADKOG/3bPSBaxq9MR3Hn5YLdGVYDM6au4QS','asd123@itwill.com',to_date('23/09/07','RR/MM/DD'),2,null,to_date('23/09/07','RR/MM/DD'),1,1,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (75,'asd1234','$2a$10$4gebYR0.kN1KeYv6SS/l9OxKDZPP74iAow2WJeWIPEBuJHotlo/du','asd1234@itwm.com',to_date('23/09/06','RR/MM/DD'),2,null,to_date('23/09/06','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (80,'zz123','$2a$10$bBTWnyWIaj3IJ4HF4sgDXeePVIJezMNO8L./gsDDTvn3wUNaNthj.','zxc1234@naver.com',to_date('23/09/07','RR/MM/DD'),2,null,to_date('23/09/07','RR/MM/DD'),5,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (81,'abcd12345','$2a$10$Wkjz99YXUCSbEi.Q2SvWo.N3O.33Ag0THdASSr4JBkIkgQhPfOplO','qwe1234@itwii.com',to_date('23/09/07','RR/MM/DD'),2,null,to_date('23/09/07','RR/MM/DD'),5,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (83,'hhh123','$2a$10$JsUDQbxxmaHXQmUHpKtw7e6glSGBST.3fODHyGcQjsayBxl4O2Zci','qwe1234@itwii.com',to_date('23/09/07','RR/MM/DD'),2,null,to_date('23/09/07','RR/MM/DD'),1,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (84,'fff1234','$2a$10$VY0NVHHNdWPO9ydrFymerO2SRbtZhlXtdJwvlSerhdFS2mcimbsda','asd123@itwill.com',to_date('23/09/07','RR/MM/DD'),1,null,to_date('23/09/07','RR/MM/DD'),5,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (85,'gpals','$2a$10$8nd8F4u.w//Fa5Cy6f/8bO0Mj62R36BBjJaEiWjNDnKqygOJ.Wj/G','gpals44@itwill.com',to_date('23/09/07','RR/MM/DD'),2,null,to_date('23/09/07','RR/MM/DD'),3,1,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (86,'qq1','$2a$10$gxubfXmXpyL1gG8/.oFpeO/CBL51sSrMa434uqBTCi63AlIK.QC/W','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),5,5,5,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (87,'qq2','$2a$10$Rkra9BnuX8zYQhds8ZyFWeqcNy4gPdhqpB182NfHZtusoa/er8oty','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),3,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (88,'qq3','$2a$10$4vcMw4Rkn.urSSSyMxBq8uUDcsPZQT5iRZ7d8NkOuH7BRmitOmMfS','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),3,5,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (89,'qq4','$2a$10$8ebdGt9fOiEqXIJUrSt.q.v/qv8l4OdKxzsQXMTRddWXxb4cUAQq6','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),1,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (90,'qq5','$2a$10$bo78CNtFBv5NAtBiYNMJJONUcoiDMnaVrlI.mWTbLjeTVuWBgyiH.','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),3,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (92,'qq7','$2a$10$VEbIGUQTFk/AYjdtCK5Iq.Ya9WR67pclRr7a86nui3lHYXCMhGOUC','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),1,null,to_date('23/09/08','RR/MM/DD'),3,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (93,'qq7','$2a$10$pLADJodSqpJ5FDO9FKejqetWHngN0EO4vzqPqkwctQypF4x8Lj2V2','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),1,null,to_date('23/09/08','RR/MM/DD'),3,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (94,'qq8','$2a$10$1kjJaqVT1NCuq3ZOl9EJhekAaFh1MWBrt8KdoxLMlGZMMmzggx9kO','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),2,null,to_date('23/09/08','RR/MM/DD'),1,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (102,'qq10','$2a$10$rqrfM1RD9hkQ6YAT9/tVruotGxH7/0YdCsMT1t7V9qyNHH4.tnTo.','qq1@naver.com',to_date('23/09/11','RR/MM/DD'),1,null,to_date('23/09/11','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (103,'qq10','$2a$10$q6TvySMLDgm.VetHyYHm7uCNc0NPuarVJfI/K8HplXlJJ.xhfloMy','qq1@naver.com',to_date('23/09/11','RR/MM/DD'),1,null,to_date('23/09/11','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (104,'qq11','$2a$10$hPRwS3IsKwHxontqLaxDSeokMjyrlBUTM9lWJOrNve0XRVz5iHxHy','qq1@naver.com',to_date('23/09/11','RR/MM/DD'),1,null,to_date('23/09/11','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (148,'rrr111','rrr111@@','rrr111@rrr.rrr',to_date('23/09/20','RR/MM/DD'),1,null,to_date('23/09/20','RR/MM/DD'),6,7,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (149,'rrr1111','rrr111!!','rrr1111@rrr.rrr',to_date('23/09/20','RR/MM/DD'),1,null,to_date('23/09/20','RR/MM/DD'),3,1,8,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (168,'naver_xYUdR2rWcR_oFEz1xJd0xwmrZO90FcP4VQ5QH7wt3tQ','588d659d-a055-449a-a7aa-5eeca5ff3ce3','null@hanmail.net',to_date('23/09/22','RR/MM/DD'),2,null,to_date('23/09/22','RR/MM/DD'),1,2,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (172,'google_110588030174201337914','3a21ae8f-4e26-4584-af60-e184ba0848e6','gpals9876@gmail.com',to_date('23/09/22','RR/MM/DD'),2,null,to_date('23/09/22','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (182,'asd12345','$2a$10$G8KdMv4tOH6YNx6Qps6ilu47I7J/QmqED3Jrcl6qrYB8Pc5fWClM2','asd12345@asd.com',to_date('23/09/25','RR/MM/DD'),1,null,to_date('23/09/25','RR/MM/DD'),7,5,9,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (199,'uu1234','$2a$10$xGbKip1UlyWTwqMrhNxGnOxb3uV7IMXSwOw96B557nfeXrkgnvJ2e','uu123@itwill.com',to_date('23/09/26','RR/MM/DD'),2,null,to_date('23/09/26','RR/MM/DD'),5,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (200,'234ssy','$2a$10$MzTODOVIfEWhLtuKKulv3eVCA6B7rcIykCDEonls9iej6iEvwyOQK','3437ssy@naver.com',to_date('23/09/26','RR/MM/DD'),1,null,to_date('23/09/26','RR/MM/DD'),3,5,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (201,'yy1234','$2a$10$PqebEt44QvPxhei2BXtxRe05Vm7xXXX7Fxgtz/r2wDUJz7JADzpRq','yy123@itwillcom',to_date('23/09/26','RR/MM/DD'),2,null,to_date('23/09/26','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (91,'qq6','$2a$10$Wa29/wA7v4b1m9l9efHeK.8HFB3uWVGgFtA4JdV1B9X4iqoE2C86C','qq1@naver.com',to_date('23/09/08','RR/MM/DD'),0,null,to_date('23/09/08','RR/MM/DD'),3,3,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (181,'asdf1234','asdf1234@@','asdf1234@asdf.asdf',to_date('23/09/25','RR/MM/DD'),1,null,to_date('23/09/25','RR/MM/DD'),5,7,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (101,'123ssy','$2a$10$Ni.dzqhlYZW3Tbz0c6EWyuwtks6Xvn43nSRfOyXyVukjG/ATqkqnO','3437ssy@naver.com',to_date('23/09/10','RR/MM/DD'),2,null,to_date('23/09/10','RR/MM/DD'),3,3,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (147,'qqq123','qqq123@@','qqq123@qqq.qqq',to_date('23/09/20','RR/MM/DD'),1,null,to_date('23/09/20','RR/MM/DD'),6,3,10,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (183,'hi1234','$2a$10$xlc8DRMzJu8SwRBEAK4nP.glRBdCVnECL3mmNy9.viwlPqZJUVOaO','hi1234@naver.com',to_date('23/09/25','RR/MM/DD'),2,null,to_date('23/09/25','RR/MM/DD'),5,1,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (188,'google_106537143813673969419','$2a$10$lgOQ7efIP5V0HohmmxPUEebAI/XLXPopf/VDsuZhciiWcEGDPE5ki','jirun0113@gmail.com',to_date('23/09/25','RR/MM/DD'),1,null,to_date('23/09/25','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (196,'kakao_������','$2a$10$81y7H5CMaiLvyKApsPhpLuQIiMKfpn03kH2J6G4d9Vd/fNUc9wF3i','gpalsqkqk@daum.net',to_date('23/09/26','RR/MM/DD'),1,null,to_date('23/09/26','RR/MM/DD'),11,11,11,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (197,'google_110456812873759616451','$2a$10$hlxctLspbozPjk7kjWH7x.83ax3RSlMcxOWSH7sNb32wW9CTsqD7S','sgwonbe212@gmail.com',to_date('23/09/26','RR/MM/DD'),1,null,to_date('23/09/26','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (189,'google_106537143813673969419','$2a$10$Ug9MjY.RhPcwLg3JWzWTyunRZzcXIshB6ktHauYVYxJxCYP5T/PdC','jirun0113@gmail.com',to_date('23/09/25','RR/MM/DD'),1,null,to_date('23/09/25','RR/MM/DD'),1,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (17,'sgwonbe9854','$2a$10$w5mxKLPKFhq0SEPYL7aURu1ziR9amr3b5NSchfsExOfPlrtmjzgPy','sgwonbe212@gmail.com',to_date('23/08/27','RR/MM/DD'),2,null,to_date('23/08/27','RR/MM/DD'),4,6,2,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (36,'deedede','$2a$10$lXDjWk1Wxlh1DaE9CckoP.ffxc1JAYrLLoCngdxMXRJzrxeU1Aks2','ded@nabve.com',to_date('23/08/30','RR/MM/DD'),0,null,to_date('23/08/30','RR/MM/DD'),3,5,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (50,'zxc1234','$2a$10$86etO6ts//E3tPijihW1K.r91yaKcnof2rzZW0bw6tIbCNGUenWAu','zxc1234@naver.com',to_date('23/08/31','RR/MM/DD'),0,null,to_date('23/08/31','RR/MM/DD'),3,1,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (74,'qwe1234','$2a$10$OLOkaLyaKGsCGunyoTs6G.RcdUbkd3a8mWITazdrxYAHBiGK4J8nu','qwe1234@itwii.com',to_date('23/09/06','RR/MM/DD'),2,null,to_date('23/09/06','RR/MM/DD'),5,5,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (76,'zxc12345','$2a$10$D7eGMofQHc8w/NQJRA7CSOdCs4hdap1TrEN.bGtTleIClTK8943Ee','zxc1234@naver.com',to_date('23/09/06','RR/MM/DD'),2,null,to_date('23/09/06','RR/MM/DD'),3,5,3,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (77,'qwe12345','$2a$10$RNE1vL1SZHH9zRY3k8g18uO9QZb1n9nuP9rJ9Yduwrp2M.Zo9oA32','qwe1234@itwii.com',to_date('23/09/06','RR/MM/DD'),2,null,to_date('23/09/06','RR/MM/DD'),3,1,1,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (78,'aaa123','$2a$10$e67iXDYIkXbAiFgiQwfDI.3VqPYGWRzspB8FtvHq.GSyEoG88BUAq','asd123@itwill.com',to_date('23/09/06','RR/MM/DD'),1,null,to_date('23/09/06','RR/MM/DD'),3,5,5,1);
Insert into FIVEJO1234.MEMBER (MEMBER_IDX,ID,PASSWORD,EMAIL,MEMBER_DATE,MEMBER_STATUS,MEMBERFILE_NAME,LOGIN_DATE,CATEGORY_ONE,CATEGORY_TWO,CATEGORY_THREE,ENABLED) values (185,'google_105805579954197010673','$2a$10$Xwjp4khkbOEyOWjqG.VTW.EwfrsE7ZPdZUjlL5UA3EbrnF0/wJRAC','rkdalsrud7382@gmail.com',to_date('23/09/25','RR/MM/DD'),2,null,to_date('23/09/25','RR/MM/DD'),1,1,1,1);
REM INSERTING into FIVEJO1234.AUTH
SET DEFINE OFF;
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (99,'google_111156989947541972899','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (91,'google_106537143813673969419','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (100,'google_113135032411802372127','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (95,'pp9876','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (124,'123ssy','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (123,'google_110588030174201337914','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (1,'sgwonbe212','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (2,'qkrgkdbs95','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (3,'qkrgkdbs95','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (4,'sgwonbe212','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (5,'abc123','ROLE_ADMIN');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (6,'123ssy','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (57,'google_117990942679869560763','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (86,'jw960212','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (61,'google_117990942679869560763','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (109,'ii12345','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (110,'ii12345','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (121,'kakao_��ȯ','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (93,'pp1234','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (94,'pp1234','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (96,'pp9876','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (97,'oo1234','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (98,'oo1234','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (122,'kakao_��ȯ','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (41,'rrr1111','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (53,'asd123','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (9,'asd123','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (55,'naver_xYUdR2rWcR_oFEz1xJd0xwmrZO90FcP4VQ5QH7wt3tQ','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (59,'kakao_������','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (56,'google_110588030174201337914','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (101,'google_111156989947541972899','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (102,'google_105805579954197010673','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (108,'kakao_������','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (113,'uu1234','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (114,'uu1234','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (115,'234ssy','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (116,'yy1234','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (117,'yy1234','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (87,'asd12345','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (89,'hi1234','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (88,'naver_xYUdR2rWcR_oFEz1xJd0xwmrZO90FcP4VQ5QH7wt3tQ','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (90,'hi1234','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (106,'kakao_������','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (107,'google_110456812873759616451','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (105,'google_113135032411802372127','ROLE_EXPERT');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (85,'asdf1234','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (92,'google_105805579954197010673','ROLE_MEMBER');
Insert into FIVEJO1234.AUTH (AUTH_IDX,ID,ROLE) values (111,'kakao_������','ROLE_EXPERT');
REM INSERTING into FIVEJO1234.CATEGORY
SET DEFINE OFF;
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (1,'������','�׷���');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (2,'������','��ǰ');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (3,'����','����');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (4,'����','�߱���');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (5,'���� ����','��� ����ũ��');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (6,'���� ����','��ǰ ȫ�� ����');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (7,'����','�����');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (8,'����','����');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (9,'������','SNSȫ��');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (10,'������','�ؿܸ�����');
Insert into FIVEJO1234.CATEGORY (CATEGORY_IDX,LARGE,SMALL) values (11,'�Ҽ� �α���','null');
REM INSERTING into FIVEJO1234.STATUS
SET DEFINE OFF;
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (0,'���');
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (1,'ȯ��');
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (2,'������');
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (3,'������');
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (4,'���ۿϷ�');
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (5,'����Ȯ��');
Insert into FIVEJO1234.STATUS (STATUS_IDX,STATUS) values (6,'����Ϸ�');
REM INSERTING into FIVEJO1234.PHOTO
SET DEFINE OFF;
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (15,8,'6e48050e-fed8-4031-8838-353f1e4dcd2f_main-controls-cropped.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (30,32,'84489630-484c-4547-951b-af4624ad79e5_hairmakeup.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (16,16,'2c2e50ba-0393-4bb2-acf3-5cf3b392d13e_drawing.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (31,33,'f26576fd-90c5-44eb-bf16-1cfc79ff19c4_worldokta.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (32,34,'4c1f3454-7332-4fb1-b8b4-37a98217d765_private.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (33,35,'463aff67-dcd2-44dd-8a67-5877feca3c5a_snsselling.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (34,36,'7f7418e7-46a0-48d7-8674-18da5316fd0e_linkedin.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (35,38,'aa722024-5e74-482e-b037-3397a1707241_chineseenglish.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (101,81,'4e175f58-5500-46ed-a896-436eb44dc9f0_businessCount.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (6,9,'99eb6a8c-fdfa-4e51-82be-2c19f3091a54_listen.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (7,10,'05997917-7648-4091-99db-80022848cb58_chinese.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (4,7,'db050758-ce75-43d7-935c-0b7be64e4838_valeriia-miller-_42NKYROG7g-unsplash.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (28,30,'244900b6-1027-4258-a237-f38df4349e7d_1.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (10,14,'89ba6155-8d20-4890-b576-b75c7e747c73_design.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (36,39,'158075b5-0619-49b7-b25e-8eb29c87bd23_hayun.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (37,40,'654685d6-7e88-4ef6-8576-f77e3eefda44_hayundesign.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (29,31,'cb982403-af9f-4561-874b-0b54dfd7750a_snsphoto.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (9,12,'3c546205-7698-48ca-a0c7-8c82581a70ca_pat-taylor-12V36G17IbQ-unsplash.png');
Insert into FIVEJO1234.PHOTO (PHOTO_IDX,ITEM_IDX,ITEMFILE_NAME) values (81,76,'e998e56d-93d4-4369-9d01-dcd774757b8b_clock.png');
REM INSERTING into FIVEJO1234.PAYMENT
SET DEFINE OFF;
REM INSERTING into FIVEJO1234.BOARD
SET DEFINE OFF;
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (41,'�ȳ��ϼ���','��ǰ ���Ǹ� �帮���ͽ��ϴ�.','123ssy',null,1,0,to_date('23/09/16','RR/MM/DD'),0,to_date('23/09/16','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (87,'��� ���� ���ǵ帳�ϴ�','����� ������ �ް� �ͽ��ϴ�.','123ssy',null,0,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (103,'�ȳ��ϼ��� 5���Դϴ�','5���Դϴ�','qkrgkdbs95',null,1,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (104,'�ȳ��ϼ��� 5���Դϴ�','5���Դϴ� ����','qkrgkdbs95',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (2,'1','��','sgwonbe212','��',1,0,to_date('23/09/10','RR/MM/DD'),0,to_date('23/09/10','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (3,'d3','de3','123ssy','d3e',1,0,to_date('23/09/11','RR/MM/DD'),0,to_date('23/09/11','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (4,'d3','de3','123ssy','d3e',0,0,to_date('23/09/11','RR/MM/DD'),0,to_date('23/09/11','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (5,'d3','de3','123ssy','d3e',1,0,to_date('23/09/11','RR/MM/DD'),0,to_date('23/09/11','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (8,'1','2','123ssy','34',1,0,to_date('23/09/11','RR/MM/DD'),0,to_date('23/09/11','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (35,'��','����¡..�ȴ�','123ssy','�̫���..',0,0,to_date('23/09/14','RR/MM/DD'),0,to_date('23/09/14','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (64,'���ǵ帳�ϴ�','��ǰ �ΰ� �� �ϳ��� ����� �����ǳ���?','123ssy',null,1,0,to_date('23/09/23','RR/MM/DD'),0,to_date('23/09/23','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (88,'�籸���ϰ������� �Ǹ��ڰ� ��������ϴ�','���� �Ǹ��� ������ �˰� �ͽ��ϴ�...','sgwonbe212',null,1,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (89,'����','����','sgwonbe212',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (90,'5���Դϴ�','�۾����Դϴ�','123ssy',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (91,'5���Դϴ� �ڽ��Ǳ��Դϴ�','�۾����Դϴ�','123ssy',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (92,'5���Դϴ� �ڽ��Ǳ��Դϴ�.','�۾����Դϴ�','123ssy',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (93,'5���Դϴ� �ڽ��Ǳ��Դϴ�.','�۾����Դϴ�','123ssy',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (94,'5���Դϴ�','5','234ssy',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (6,'qef3','q3f','123ssy','3r1',0,0,to_date('23/09/11','RR/MM/DD'),0,to_date('23/09/11','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (7,'qef3','q3f','123ssy','3r1',0,0,to_date('23/09/11','RR/MM/DD'),0,to_date('23/09/11','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (21,'cff','cr4rcr4','123ssy','c4f',1,0,to_date('23/09/12','RR/MM/DD'),0,to_date('23/09/12','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (22,'��','����¡..','123ssy','�̫���..',1,0,to_date('23/09/13','RR/MM/DD'),0,to_date('23/09/13','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (23,'rf3','gr45','123ssy','54g54',1,0,to_date('23/09/13','RR/MM/DD'),0,to_date('23/09/13','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (42,'ȯ���� ����� �ȵƽ��ϴ�.','�߱��� ���Ǹ� ��µ� ȯ���� �Ϻκи� �ƽ��ϴ�.','123ssy','�̫���..',1,0,to_date('23/09/16','RR/MM/DD'),0,to_date('23/09/16','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (43,'ȯ��','�߱��� ���Ǹ� ��µ���. ȯ���� ����� ���� �ʾҽ��ϴ�.','123ssy','23rr323',1,0,to_date('23/09/16','RR/MM/DD'),0,to_date('23/09/16','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (61,'�ȳ��ϼ��� ���ǵ帳�ϴ�.','ȯ�� ��������� ��� �Ǵ��� �ñ��մϴ�. ','sgwonbe212',null,1,0,to_date('23/09/23','RR/MM/DD'),0,to_date('23/09/23','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (62,'����������','����������','sgwonbe212',null,1,0,to_date('23/09/23','RR/MM/DD'),0,to_date('23/09/23','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (85,'���ǵ帳�ϴ�.','���� ǰ�� ���ؼ� ���ǵ帳�ϴ�..','qkrgkdbs95',null,0,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (63,'ȯ�Һ�Ź�����','��ǰ�� ���ؼ� �Խ��ϴ�','123ssy',null,1,0,to_date('23/09/23','RR/MM/DD'),0,to_date('23/09/23','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (81,'�ȳ��ϼ���','ȯ�ҹ��ǵ����','123ssy',null,1,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (82,'������ �������� ����','������ ��ǰ�� �Ǹ����� ������ ���� ���������� ��ǰ ���Ǹ� �ϰ��ͽ��ϴ�.','123ssy',null,1,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (83,'��� ���� ���ǵ帳�ϴ�','����� ������ �ް� �ͽ��ϴ�.','123ssy',null,0,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (84,'����',' �����ڷ� ���� ������ �� �Խù� ���ǵ帳�ϴ�.','123ssy',null,0,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (86,'���ǵ帳�ϴ�.','���� ǰ�� ���ؼ� ���ǵ帳�ϴ�..
�����մϴ�. ','qkrgkdbs95',null,0,0,to_date('23/09/25','RR/MM/DD'),0,to_date('23/09/25','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (101,'�ȳ��ϼ���','���ǳ���ϴ�','qkrgkdbs95',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (102,'�ȳ��ϼ���','���ǳ���ϴ� 5���Դϴ�','qkrgkdbs95',null,0,0,to_date('23/09/26','RR/MM/DD'),0,to_date('23/09/26','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (24,'efe','fee2','123ssy','2e4g',0,0,to_date('23/09/14','RR/MM/DD'),0,to_date('23/09/14','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (25,'22rr','2r2r','123ssy','23rr323',0,0,to_date('23/09/14','RR/MM/DD'),0,to_date('23/09/14','RR/MM/DD'));
Insert into FIVEJO1234.BOARD (BOARD_IDX,BOARD_TITLE,BOARD_CONTENT,ID,BOARDFILE_NAME,BOARD_STATUS,VIEW_CNT,REG_DATE,COMMENT_CNT,UP_DATE) values (34,'��','����¡..�ȴ�','123ssy','�̫���..',0,0,to_date('23/09/14','RR/MM/DD'),0,to_date('23/09/14','RR/MM/DD'));
REM INSERTING into FIVEJO1234.SALES
SET DEFINE OFF;
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (32,9,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (37,12,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (38,12,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (39,14,to_date('23/08/31','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (41,16,to_date('23/08/31','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (101,76,to_date('23/09/16','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (102,76,to_date('23/09/16','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (164,76,to_date('23/09/26','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (44,14,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (47,9,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (48,14,to_date('23/08/31','RR/MM/DD'),5);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (105,81,to_date('23/09/16','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (182,30,to_date('23/09/26','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (34,10,to_date('23/08/30','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (35,16,to_date('23/08/31','RR/MM/DD'),5);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (36,12,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (42,14,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (45,16,to_date('23/08/31','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (50,10,to_date('23/09/01','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (51,14,to_date('23/09/03','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (52,14,to_date('23/09/06','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (61,35,to_date('23/09/08','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (106,81,to_date('23/09/16','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (127,14,to_date('23/09/21','RR/MM/DD'),2);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (162,35,to_date('23/09/25','RR/MM/DD'),6);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (166,31,to_date('23/09/26','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (165,14,to_date('23/09/26','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (181,31,to_date('23/09/26','RR/MM/DD'),4);
Insert into FIVEJO1234.SALES (SALES_IDX,ITEM_IDX,SALES_DATE,SALES_STATUS) values (107,81,to_date('23/09/18','RR/MM/DD'),2);
--------------------------------------------------------
--  DDL for Index SYS_C0032622
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032622" ON "FIVEJO1234"."CART" ("CART_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032945
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032945" ON "FIVEJO1234"."INTEREST" ("INTEREST_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032597
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032597" ON "FIVEJO1234"."ITEM" ("ITEM_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032587
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032587" ON "FIVEJO1234"."EXPERT" ("EXPERT_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032638
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032638" ON "FIVEJO1234"."REVIEW" ("REVIEW_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032630
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032630" ON "FIVEJO1234"."PURCHASE" ("PURCHASE_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032559
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032559" ON "FIVEJO1234"."MEMBER" ("MEMBER_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0033435
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0033435" ON "FIVEJO1234"."AUTH" ("AUTH_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032562
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032562" ON "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0033506
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0033506" ON "FIVEJO1234"."STATUS" ("STATUS_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032608
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032608" ON "FIVEJO1234"."PHOTO" ("PHOTO_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0033545
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0033545" ON "FIVEJO1234"."PAYMENT" ("IMP_UID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0033274
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0033274" ON "FIVEJO1234"."BOARD" ("BOARD_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C0032603
--------------------------------------------------------

  CREATE UNIQUE INDEX "FIVEJO1234"."SYS_C0032603" ON "FIVEJO1234"."SALES" ("SALES_IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table CART
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."CART" ADD PRIMARY KEY ("CART_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."CART" MODIFY ("ITEM_PHOTO_IDX" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."CART" MODIFY ("ITEM_IDX" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."CART" MODIFY ("MEMBER_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table INTEREST
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."INTEREST" ADD PRIMARY KEY ("INTEREST_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."INTEREST" MODIFY ("MEMBER_IDX" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."INTEREST" MODIFY ("CATEGORY_IDX_THREE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."INTEREST" MODIFY ("CATEGORY_IDX_TWO" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."INTEREST" MODIFY ("CATEGORY_IDX_ONE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ITEM
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."ITEM" ADD PRIMARY KEY ("ITEM_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("ITEM_DATE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("ITEM_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("PRICE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("ITEM_CONTENT" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("ITEM_NAME" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("EXPERT_IDX" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."ITEM" MODIFY ("CATEGORY_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EXPERT
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."EXPERT" ADD PRIMARY KEY ("EXPERT_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."EXPERT" MODIFY ("INTEREST" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."EXPERT" MODIFY ("PHONE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."EXPERT" MODIFY ("MEMBER_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table REVIEW
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."REVIEW" ADD PRIMARY KEY ("REVIEW_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."REVIEW" MODIFY ("REVIEW_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."REVIEW" MODIFY ("REVIEW_DATE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."REVIEW" MODIFY ("SCORE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."REVIEW" MODIFY ("PURCHASE_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PURCHASE
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."PURCHASE" ADD PRIMARY KEY ("PURCHASE_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."PURCHASE" MODIFY ("PURCHASE_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."PURCHASE" MODIFY ("PURCHASE_DATE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."PURCHASE" MODIFY ("MEMBER_IDX" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."PURCHASE" MODIFY ("ITEM_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."MEMBER" ADD PRIMARY KEY ("MEMBER_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."MEMBER" MODIFY ("MEMBER_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."MEMBER" MODIFY ("MEMBER_DATE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."MEMBER" MODIFY ("EMAIL" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."MEMBER" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."MEMBER" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table AUTH
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."AUTH" ADD PRIMARY KEY ("AUTH_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CATEGORY
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."CATEGORY" ADD PRIMARY KEY ("CATEGORY_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."CATEGORY" MODIFY ("SMALL" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."CATEGORY" MODIFY ("LARGE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table STATUS
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."STATUS" ADD PRIMARY KEY ("STATUS_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PHOTO
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."PHOTO" ADD PRIMARY KEY ("PHOTO_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."PHOTO" MODIFY ("ITEM_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PAYMENT
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."PAYMENT" ADD PRIMARY KEY ("IMP_UID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."PAYMENT" MODIFY ("SALES_IDX" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."PAYMENT" MODIFY ("PURCHASE_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table BOARD
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."BOARD" ADD PRIMARY KEY ("BOARD_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."BOARD" MODIFY ("BOARD_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."BOARD" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."BOARD" MODIFY ("BOARD_CONTENT" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."BOARD" MODIFY ("BOARD_TITLE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table SALES
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."SALES" ADD PRIMARY KEY ("SALES_IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "FIVEJO1234"."SALES" MODIFY ("SALES_STATUS" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."SALES" MODIFY ("SALES_DATE" NOT NULL ENABLE);
  ALTER TABLE "FIVEJO1234"."SALES" MODIFY ("ITEM_IDX" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table CART
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."CART" ADD CONSTRAINT "ITEM_CART_IDX_FK" FOREIGN KEY ("ITEM_IDX")
	  REFERENCES "FIVEJO1234"."ITEM" ("ITEM_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."CART" ADD CONSTRAINT "MEMBER_CART_IDX_FK" FOREIGN KEY ("MEMBER_IDX")
	  REFERENCES "FIVEJO1234"."MEMBER" ("MEMBER_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."CART" ADD CONSTRAINT "PHOTO_IDX_FK" FOREIGN KEY ("ITEM_PHOTO_IDX")
	  REFERENCES "FIVEJO1234"."PHOTO" ("PHOTO_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table INTEREST
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."INTEREST" ADD CONSTRAINT "CATEGORY_ONE_FK" FOREIGN KEY ("CATEGORY_IDX_ONE")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."INTEREST" ADD CONSTRAINT "CATEGORY_THREE_FK" FOREIGN KEY ("CATEGORY_IDX_THREE")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."INTEREST" ADD CONSTRAINT "CATEGORY_TWO_FK" FOREIGN KEY ("CATEGORY_IDX_TWO")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."INTEREST" ADD CONSTRAINT "MEMBER_IDX_FK" FOREIGN KEY ("MEMBER_IDX")
	  REFERENCES "FIVEJO1234"."MEMBER" ("MEMBER_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ITEM
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."ITEM" ADD CONSTRAINT "ITEM_CATEGORY_FK" FOREIGN KEY ("CATEGORY_IDX")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."ITEM" ADD CONSTRAINT "ITEM_EXPERT_FK" FOREIGN KEY ("EXPERT_IDX")
	  REFERENCES "FIVEJO1234"."EXPERT" ("EXPERT_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table EXPERT
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."EXPERT" ADD CONSTRAINT "EXPERT_CATEGORY_FK" FOREIGN KEY ("INTEREST")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."EXPERT" ADD CONSTRAINT "EXPERT_MEMBER_FK" FOREIGN KEY ("MEMBER_IDX")
	  REFERENCES "FIVEJO1234"."MEMBER" ("MEMBER_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table REVIEW
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."REVIEW" ADD CONSTRAINT "REVIEW_PURCHASE_FK" FOREIGN KEY ("PURCHASE_IDX")
	  REFERENCES "FIVEJO1234"."PURCHASE" ("PURCHASE_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PURCHASE
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."PURCHASE" ADD CONSTRAINT "PURCHASE_ITEM_FK" FOREIGN KEY ("ITEM_IDX")
	  REFERENCES "FIVEJO1234"."ITEM" ("ITEM_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."PURCHASE" ADD CONSTRAINT "PURCHASE_MEMBER_FK" FOREIGN KEY ("MEMBER_IDX")
	  REFERENCES "FIVEJO1234"."MEMBER" ("MEMBER_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."MEMBER" ADD CONSTRAINT "MEMBER_CATEGORY_ONE_FK" FOREIGN KEY ("CATEGORY_ONE")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."MEMBER" ADD CONSTRAINT "MEMBER_CATEGORY_THREE_FK" FOREIGN KEY ("CATEGORY_THREE")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
  ALTER TABLE "FIVEJO1234"."MEMBER" ADD CONSTRAINT "MEMBER_CATEGORY_TWO_FK" FOREIGN KEY ("CATEGORY_TWO")
	  REFERENCES "FIVEJO1234"."CATEGORY" ("CATEGORY_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PHOTO
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."PHOTO" ADD CONSTRAINT "ITEM_PHOTO_IDX_FK" FOREIGN KEY ("ITEM_IDX")
	  REFERENCES "FIVEJO1234"."ITEM" ("ITEM_IDX") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SALES
--------------------------------------------------------

  ALTER TABLE "FIVEJO1234"."SALES" ADD CONSTRAINT "ITEM_IDX_FK" FOREIGN KEY ("ITEM_IDX")
	  REFERENCES "FIVEJO1234"."ITEM" ("ITEM_IDX") ENABLE;
g fornual.sql…]()


# 피드백
0908 파이널 프로젝트 / 첫번째 피드백


1.	프로젝트 방향


완성도를 높이기 위하여... 


- 기능을 여러개 만드는 것이 주니어 개발자에겐 조금 더 도움이 될 수 있을 것
- 검증 로직(ex.@transaction)을 통하여 404,500 상태코드를 최소화 할 것 <- 특히나 결제와 관련된 기능은 더더욱 신경을 쓸 것
- 공용 Exception을 활용하도록 할 것


2. api는 사용할 수 있다면 되도록 사용하여 api를 활용하는 것에 대한 익숙함을 가지도록 할 것


3. back 영역과 front 영역을 나눌 것


- 페이지를 전부 하나하나 이동하는 방식을 사용한다면 서버 비용으로 인하여 기업에 부담감을 줄 수 있다
- restcontroller를 사용하는 것에 익숙해 질 겸 AJAX를 사용 해 볼 것을 권장
- 여유가 된다면 swagger를 사용해보는 것을 추천


4. Spring Security를 사용할 때 참고 해볼 리스트


- AML을 활용해 볼 것 / AML은 자금 세탁 방지를 위한 활동 및 장책을 나타낸다


5. 소셜 로그인 시 주의사항


- front에서만 구축하는 것이 아닌, back 영역에서도 Token을 활용할 것


6. Query문을 짜임새 있게 짤 것
# 파이널 프로젝트 발표
[final ppt.pptx](https://github.com/juhoon212/fornula/files/12798265/final.ppt.pptx)


# 주요 기능

[회원가입 기능](#회원가입-기능)


- 일반적인 회원 가입 기능입니다


[로그인 기능](#로그인-기능)


- 카카오, 구글, 네이버 로그인 기능 및 일반적인 회원 가입 기능입니다


[메인페이지 기능](#메인페이지-기능)


- header, footer가 포함된 페이지입니다
- 검색, 전문가 랭킹, 고객센터, 회사소개, 카테고리별 검색 기능이 포함된 페이지입니다 


[마이페이지 기능](#마이페이지-기능)


- 내 정보 수정, 구매 관리, 장바구니, 비밀번호 수정, 회원 탈퇴 기능이 포함된 페이지입니다


[전문가페이지 기능](#전문가페이지-기능)


- 전문가 정보 수정, 판매 관리, 상품 관리, 상품 등록이 포함된 페이지입니다


[검색 기능](#검색-기능)


- SQL문을 활용하여 여러 방법(카테고리별 검색, 내용/제목 포함 검색)으로 검색이 가능하도록 만든 기능입니다


[상품 기능](#상품-기능)


- 상품 등록, 수정, 게시판 기능에 대한 페이지입니다


[QnA 기능](#QnA-기능)


- QnA 게시판 기능을 하는 페이지입니다


[전문가랭킹 기능](#전문가랭킹-기능)


- 전문가 판매액 순서로 출력, 모든 전문가를 등록일자 순서로 출력하는 페이지입니다


[결제 기능](#결제-기능)


- 카카오페이, kG 이그니스 결제 API를 활용하여 구현한 기능입니다
