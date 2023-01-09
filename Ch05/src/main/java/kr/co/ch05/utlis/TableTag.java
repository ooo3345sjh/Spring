package kr.co.ch05.utlis;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

public class TableTag {

	// 컬럼 값을 가져오는 메서드
	public final static  List<String> getThTag(String type) {

		List<String> list = null;
		
		// resources 폴더 안에 있는 파일의 객체를 가져온다.
		ClassPathResource cpr = new ClassPathResource("config.txt");
			
		Properties p = new Properties();
		
        try {
        	String realPath = cpr.getFile().toString(); // config.txt의 실제 경로를 가져온다.

        	p.load(new FileReader(realPath));
        	String data = p.getProperty(type + "ThTag"); // 매개변수에 입력한 key의 Value값을 가져온다.
			
			String[] thArr = data.split("/");
			
			// 각 인덱스를 돌며 <th>index</th>로 만든 후에 리스트로 반환
			list = Arrays.asList(thArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        return list;
	}
	
	// 행값을 가져오는 메서드
	public final static List<String> getTdTag(String type) {
		
		List<String> list = null;
		
		// resources 폴더 안에 있는 파일의 객체를 가져온다.
		ClassPathResource cpr = new ClassPathResource("config.txt");
		
		Properties p = new Properties();
		
		try {
			String realPath = cpr.getFile().toString(); // config.txt의 실제 경로를 가져온다.
			
			p.load(new FileReader(realPath));
			String data = p.getProperty(type + "TdTag"); // 매개변수에 입력한 key의 Value값을 가져온다.
			
			String[] tdArr = data.split("/");
			
			list = Arrays.asList(tdArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
}
