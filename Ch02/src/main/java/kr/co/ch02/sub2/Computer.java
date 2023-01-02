package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component(value = "com")
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
	
}
