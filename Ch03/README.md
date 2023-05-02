# **3장 스프링 AOP**

## 1. 핵심기능과 부가기능

- 업무(Biz) 로직은 핵심 기능(Core Concerns)과 부가 기능(Cross-cutting Concerns) 으로 구성된다.
- 핵심기능은 사용자가 적용하고자 하는 핵심 비즈니스 로직이고 부가적인 기능은 핵심 로직을 실행하기 위해서 행해지는 부가적인 로직으로 데이터베이스 연결, 로깅, 파일 입출력 등을 예로 들 수 있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c1474dbf-f71c-4e05-82cd-a85f6c0991c2/Untitled.png)

## 2. AOP 개요

- AOP(Aspect Oriented Programming)는 여러 객체에서 공통으로 사용하는 기능(로직)을 분리해서 재사용성을 높이는 프로그래밍 기법으로 관점 지향 프로그래밍 이라고 한다.
- AOP는 애플리케이션의 핵심적인 기능에서 부가적인 기능을 분리해서 Aspect 라는 독특한 모듈형태로 만들어서 설계하고 개발하는 방법이다.
- AOP는 부가기능을 Aspect 로 정의하여, 핵심기능에서 부가기능을 분리함으로써 핵심기능을 설계하고 구현할 때 객체지향적인 가치를 지킬 수 있도록 도와주는 개념이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ff2f67d-1239-4095-8cd4-da7d41c5c4dc/Untitled.png)

## 3. AOP 주요 용어

• AOP 주요 용어와 의미는 아래와 같다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8c937155-eb8e-43da-8ca2-6af03ae18220/Untitled.png)

## 4. Spring AOP 특징

- Spring은 Proxy(대리자) 기반 AOP를 지원한다.
- Proxy는 Advice를 Target 객체에 적용하면서 생성되는 객체이다.
- Proxy는 Target 객체에 대한 호출을 가로챈 다음 Advice의 부가기능 로직을 수행하고 난 후 Target의 핵심기능 로직을 호출한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/362d081b-3848-495a-9fdf-621eb5c9e680/Untitled.png)
