# **5장 MyBatis**

## 1. 데이터 영속성(Persistence) 이란?

- 데이터를 생성한 프로그램이 종료되더라도 사라지지 않는 데이터의 특성
- 영속성이 없는 데이터는 단지 메모리에서만 존재하기 때문에 프로그램을 종료하면 모두 소멸
- 메모리 상의 데이터를 파일 시스템, 데이터베이스 등을 활용하여 영구적으로 저장하여 영속성 부여
- 데이터를 데이터베이스에 저장하는 방법으로 JDBC, Persistence Framework 기술을 활용
- Spring MVC 에서 Persistence Layer는 데이터에 영속성을 부여해주는 계층

![Untitled](https://user-images.githubusercontent.com/111489860/235742833-91d7e3b9-b16b-46e5-b16d-db628aa78d5d.png)

## 2. ORM 이란?

- ORM은 객체-관계 연결(Object Relational Mapping) 의미로 객체와 데이터베이스의 테이블을 자동으로 매핑(연결) 해주는 기술
- ORM 기술을 통해 객체를 통해 간접적으로 데이터베이스의 데이터를 처리
- ORM의 장점은 비즈니스 로직에 더 집중하고 특정 DBMS에 대한 종속성을 줄이는 효과
- ORM 만으로 완벽한 서비스 구현이 어렵고, 프로젝트 복잡성이 커질 경우 구현 난이도 증가
- ORM 기술을 지원하는 프레임워크(Persistant API)로 MyBatis, JPA, Hibernate 등

![Untitled](https://user-images.githubusercontent.com/111489860/235742875-31937a62-ac3c-4190-ae59-7bf2d7b95f40.png)

## 3. MyBatis의 개요

- MyBatis는 객체와 SQL을 자동 Mapping을 지원하는 ORM 프레임워크
- MyBatis는 SQL을 별도의 파일로 분리해서 관리하고, 객체-SQL 사이의 파라미터 Mapping 작업을 자동으로 해주기 때문에 가장 많이 사용하는 ORM 기술
- MyBatis는 Hibernate나 JPA처럼 새로운 DB 프로그래밍 패러다임을 익혀야 하는 부담이 없이, 개발자가 익숙한 SQL을 그대로 이용하면서 JDBC 코드 작성의 불편함도 제거해주고, 도메인 객체나 VO 객체를 중심으로 개발이 가능하다는 장점
- 가장 간단한 ORM Framework로 복잡한 JDBC 코드 대신 MyBatis API로 SQL 수행

![Untitled](https://user-images.githubusercontent.com/111489860/235742924-d2e474e0-c2fd-4d56-bc9f-8fb75dddd829.png)

## 4. MyBatis 주요 컴포넌트

![Untitled](https://user-images.githubusercontent.com/111489860/235742987-af56d955-67d7-4111-b5ed-e4dd9712db19.png)
