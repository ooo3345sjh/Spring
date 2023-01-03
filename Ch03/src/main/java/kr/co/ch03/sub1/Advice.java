package kr.co.ch03.sub1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {
	
	/*
	// * - 반환값 / .. - 모든 매개변수
	@Pointcut("execution(* kr.co.ch03.sub1.Service.insert(..))")
	public void insertPointcut() {}
	
	// select* select로 시작하는 모든 메서드
	@Pointcut("execution(* kr.co.ch03.sub1.Service.select*(..))")
	public void selectPointcut() {}
	*/
	
	// 전체 적용
	@Pointcut("execution(* kr.co.ch03.sub1.Service.*(..))")
	public void beforePointcut() {}

	@Pointcut("execution(* kr.co.ch03.sub1.Service.*(..))")
	public void afterPointcut() {}
	
	@Before("beforePointcut()")
	public void before() {
		System.out.println("횡단관심 - before...");
	}
	
	@After("afterPointcut()")
	public void after() {
		System.out.println("횡단관심 - after...");
	}
	
	
}
