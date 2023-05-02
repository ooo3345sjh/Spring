# **3장 스프링 AOP**

## 1. 핵심기능과 부가기능

- 업무(Biz) 로직은 핵심 기능(Core Concerns)과 부가 기능(Cross-cutting Concerns) 으로 구성된다.
- 핵심기능은 사용자가 적용하고자 하는 핵심 비즈니스 로직이고 부가적인 기능은 핵심 로직을 실행하기 위해서 행해지는 부가적인 로직으로 데이터베이스 연결, 로깅, 파일 입출력 등을 예로 들 수 있다.

![Untitled](https://user-images.githubusercontent.com/111489860/235738543-d411f8ae-e519-45d5-820e-03d242f38ae0.png)

## 2. AOP 개요

- AOP(Aspect Oriented Programming)는 여러 객체에서 공통으로 사용하는 기능(로직)을 분리해서 재사용성을 높이는 프로그래밍 기법으로 관점 지향 프로그래밍 이라고 한다.
- AOP는 애플리케이션의 핵심적인 기능에서 부가적인 기능을 분리해서 Aspect 라는 독특한 모듈형태로 만들어서 설계하고 개발하는 방법이다.
- AOP는 부가기능을 Aspect 로 정의하여, 핵심기능에서 부가기능을 분리함으로써 핵심기능을 설계하고 구현할 때 객체지향적인 가치를 지킬 수 있도록 도와주는 개념이다.

![Untitled](https://user-images.githubusercontent.com/111489860/235738598-aaa4c0f6-81fc-486c-b8d4-8f2ac0ea43e5.png)

## 3. AOP 주요 용어

• AOP 주요 용어와 의미는 아래와 같다.

![Untitled](https://user-images.githubusercontent.com/111489860/235738623-38f5b555-ce9e-40a0-bed4-6a3844254bef.png)

## 4. Spring AOP 특징

- Spring은 Proxy(대리자) 기반 AOP를 지원한다.
- Proxy는 Advice를 Target 객체에 적용하면서 생성되는 객체이다.
- Proxy는 Target 객체에 대한 호출을 가로챈 다음 Advice의 부가기능 로직을 수행하고 난 후 Target의 핵심기능 로직을 호출한다.

![Untitled](https://user-images.githubusercontent.com/111489860/235738692-94f1757a-4dd8-42d3-8caa-ef98e3a5b015.png)
