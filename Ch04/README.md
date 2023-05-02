# **4장 Spring MVC**

## 1. MVC 개요

- MVC(Model-View-Controller)는 소프트웨어 아키텍처 패턴으로 Business logic과 Presentation logic을 분리하여 효율적인 엔터프라이즈(대규모) 애플리케이션 개발을 지원
- Controller : 사용자의 요청과 Model과 View 사이에서 상호 작용을 관리하는 컴포넌트
- Model : 애플리케이션의 데이터를 가공 처리하기 위한 컴포넌트(예: Dao, Service)
- View : 모델이 처리한 결과를 사용자에게 출력할 화면을 처리하는 컴포넌트(예: HTML, Jsp)

![Untitled](https://user-images.githubusercontent.com/111489860/235739387-ab1ac581-3fa3-4d2c-bf59-be68b07013bc.png)

## 2. Spring MVC

- Front Controller는 클라이언트가 보낸 요청을 받아서 공통적인 작업을 먼저 수행
- Front Controller는 적절한 세부 Controller에게 작업을 위임
- 각각의 애플리케이션 Controller는 클라이언트에게 보낼 뷰를 선택해서 최종 결과를 생성하는 작업
- Spring 은 Dispatcher Servlet을 Front Controller로 사용

![Untitled](https://user-images.githubusercontent.com/111489860/235739451-9bac044f-90a3-4b24-a65c-2bc2bf0dea25.png)

## 3. Spring MVC 구성요소

- Spring은 웹 개발을 위한 MVC 라이브러리(spring-webmvc)를 제공
- Spring MVC 주요 컴포넌트 정리

![Untitled](https://user-images.githubusercontent.com/111489860/235739488-8b19ae5d-06c0-49a5-a11b-9a462d6566fd.png)
