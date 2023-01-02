package kr.co.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2023/01/02
 * 이름 : 서정현
 * 내용 : Spring 소개 및 개발환경 구축
 */

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		Hello bean1 = (Hello)ctx.getBean("hello");
		Welcome bean2 = (Welcome)ctx.getBean("welcome");
		Greeting bean3 = (Greeting)ctx.getBean("greeting");
		
		bean1.show();
		bean2.show();
		bean3.show();
	}

}
