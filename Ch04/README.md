# **4장 Spring MVC**

## 1. MVC 개요

- MVC(Model-View-Controller)는 소프트웨어 아키텍처 패턴으로 Business logic과 Presentation logic을 분리하여 효율적인 엔터프라이즈(대규모) 애플리케이션 개발을 지원
- Controller : 사용자의 요청과 Model과 View 사이에서 상호 작용을 관리하는 컴포넌트
- Model : 애플리케이션의 데이터를 가공 처리하기 위한 컴포넌트(예: Dao, Service)
- View : 모델이 처리한 결과를 사용자에게 출력할 화면을 처리하는 컴포넌트(예: HTML, Jsp)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3a3f4c12-80dc-4c69-8446-31fb9c1fab94/Untitled.png)

## 2. Spring MVC

- Front Controller는 클라이언트가 보낸 요청을 받아서 공통적인 작업을 먼저 수행
- Front Controller는 적절한 세부 Controller에게 작업을 위임
- 각각의 애플리케이션 Controller는 클라이언트에게 보낼 뷰를 선택해서 최종 결과를 생성하는 작업
- Spring 은 Dispatcher Servlet을 Front Controller로 사용

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71b5267b-2318-4cde-9044-80ff6342caf8/Untitled.png)

## 3. Spring MVC 구성요소

- Spring은 웹 개발을 위한 MVC 라이브러리(spring-webmvc)를 제공
- Spring MVC 주요 컴포넌트 정리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bf4396b7-8111-45c4-8347-cbf3a0755927/Untitled.png)

## 4. Spring MVC 실습

- Spring 프로젝트 ch04 참고 (스프링 환경설정 : Dispatcher Servlet, view Resolver …)