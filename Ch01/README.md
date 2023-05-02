# 1장 Spring 소개 및 개발환경 구축

## 1. Spring 개요

- Java 웹 애플리케이션 개발을 쉽고 편리하게 해주는 오픈소스 애플리케이션 프레임워크이다.
- 프레임워크(Framework)란 비기능적 요구사항(성능, 보안, 확장성, 안정성 등)을 만족하는 구조와 구현된기능을 안정적으로 실행되도록 잘 만들어진 구조의 라이브러리 덩어리이다.
- 개발자는 복잡하고 실수하기 쉬운 Low Level 코드에 신경 쓰지 않고 Business Logic 개발에 집중 할 수 있다.

![Untitled](https://user-images.githubusercontent.com/111489860/235641342-3ce916d2-7327-46da-bdd9-f0618be71a9e.png)

## 2. Spring 주요 특징

- Spring 삼각형은 Spring의 3대 주요 핵심 특징을 요약 설명한다.
- POJO(Plain Old Java Object)는 객체지향 원리에 충실한 순수한 Java 객체로 Spring의 기반이다.
- IoC/DI 는 Spring의 핵심 기능으로 객체의 생명주기를 컨테이너를 통해 관리한다.
- AOP는 여러 객체에서 공통으로 사용하는 기능을 분리해서 재사용성을 높이는 프로그래밍 기법
- PSA는 서비스 추상화 기술로 복잡한 Low Level의 로직을 추상화하여 사용자에게 서비스 개발의 편의성을 제공한다.

![Untitled](https://user-images.githubusercontent.com/111489860/235641386-249a0b8f-b319-45ba-a77e-dd7348c15622.png)

## 3. Maven 개요

- Maven은 애플리케이션 개발에 필요한 라이브러리를 편하고 효율적으로 관리할 수 있는 자바용 프로젝트 빌드 관리도구
- 빌드(Build) 도구란 프로젝트의 생성, 테스트, 배포 등의 작업을 자동화 해주는 전용 프로그램으로 Mavan, Gradle 등이 있으며 기본적으로 모든 IDE 개발도구(Eclipse)에 내장되어 있다.
- Maven은 Maven Repository 에서 의존 라이브러리를 다운로드
- POM(Project Object Model) Maven 설정 파일로 의존 라이브리러(dependency) 관리
- Spring은 기본적으로 Maven Project

![Untitled](https://user-images.githubusercontent.com/111489860/235641420-639647ca-143c-4efc-b181-30510f7512fe.png)

- 실습 내용
    
    pom.xml에서 필요한 라이브러리 설정이 가능
    
    ![Untitled](https://user-images.githubusercontent.com/111489860/235641462-31aabac8-a893-4fc1-92b8-701d3be1e731.png)
    
    ```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>
      <groupId>co.kr.ch02</groupId>
      <artifactId>Ch02</artifactId>
      <version>0.0.1-SNAPSHOT</version>
      
      <!-- spring-context를 다운하게 되면 의존된 라이브러리 모두 다운로드됨 -->
      <dependencies>
    	<dependency>
    		<groupId>org.springframework</groupId>
    	    <artifactId>spring-context</artifactId>
    	    <version>5.3.24</version>
    	</dependency>
      </dependencies>
      
      
    </project>
    ```
    

## 4. Spring 실습 안내

## 5. 개발환경 구축
