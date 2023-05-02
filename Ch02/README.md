# 2장 스프링 IoC/DI

## 1. IoC

- IoC(Inversion of Control)는 객체의 생성, 생명주기의 관리까지 모든 객체에 대한 제어권이 바뀌었다는 것을 의미하는 제어의 역전
- 일반적으로 사용자가 객체를 생성하는 대신 객체의 제어를 사용자가 아닌 객체의 생성과 관리를 수행하는 컨테이너(IoC Container)에 위임하는 형태를 말한다.
- Spring은 Spring Container를 사용하며 객체의 생성, 초기화, 서비스, 소멸에 대한 생명주기를 관리하고 권한을 가진다.

![Untitled](https://user-images.githubusercontent.com/111489860/235642024-ba216c71-c9b9-4dde-bebe-3bd44ce57c30.png)

## 2. DI

- DI(Dependency Injection)는 의존성 주입이라 하고 IoC 개념을 프로그래밍적으로 구현하는 방법을 의미
- 각 클래스간의 의존관계를 Bean Factory(Container)가 자동으로 주입
- Spring은 DI 방법 중 Annotation(@Autowired)을 이용한 Field 방식이 가장 일반적

![Untitled](https://user-images.githubusercontent.com/111489860/235642062-d77fb0ca-1108-4229-b62a-572523c3ac47.png)

- 실습 내용
    - application.xml에서 객체(bean) 태그 생성
        
        ![Untitled](https://user-images.githubusercontent.com/111489860/235642099-95ef632d-7471-4e7b-9075-017c4e2e81d8.png)
        
        ```xml
        <?xml version="1.0" encoding="UTF-8"?>
        <beans xmlns="http://www.springframework.org/schema/beans"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:context="http://www.springframework.org/schema/context"
            xsi:schemaLocation="http://www.springframework.org/schema/beans
                https://www.springframework.org/schema/beans/spring-beans.xsd
                http://www.springframework.org/schema/context
                https://www.springframework.org/schema/context/spring-context.xsd">
        
        		<!-- 객체 주입시 필요한 태그 -->
            <context:component-scan base-package="kr.co.ch02"/>
        
            <bean id="ltv" class="kr.co.ch02.sub1.LgTV"></bean>
            <bean id="stv" class="kr.co.ch02.sub1.SamsungTV"></bean>
            <bean id="spk" class="kr.co.ch02.sub1.Speaker"></bean>
        
        </beans>
        ```
        
    - 3가지 DI방법 (객체를 생성하지 않아도 application.xml 컨테이너에서 객체 주입을 해준다.)
        
        ```java
        package kr.co.ch02.sub2;
        
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;
        
        // 클래스에 어노테이션으로 @Component 선언시 
        // application.xml에 태그를 생성하지 않아도 된다.
        @Component(value = "com") // value 값을 정해주지 않으면 클래스 이름으로 설정된다.
        public class Computer {
        
        	private CPU cpu;
        	
        	// DI - 생성자 인젝션
        	@Autowired
        	public Computer(CPU cpu) {
        		this.cpu = cpu;
        	}
        	
        	// DI - 세터 인젝션
        	private RAM ram;
        	
        	@Autowired
        	public void setRam(RAM ram) {
        		this.ram = ram;
        	}
        	
        	// DI - 필드 인젝션(일반적으로 사용)
        	@Autowired
        	private HDD hdd;
        	
        	public void show() {
        		cpu.show();
        		hdd.show();
        		ram.show();
        	}
        
        	public static void main(String[] args) {
        		
        		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
        		
        		Computer com = (Computer)ctx.getBean("com", Computer.class);
        		
        		com.show();
        	}
        }
        ```
        

## 3. IoC/DI 실습하기

![Untitled](https://user-images.githubusercontent.com/111489860/235642128-24b305b3-a9bc-4f83-9917-d8c086411bd4.png)
