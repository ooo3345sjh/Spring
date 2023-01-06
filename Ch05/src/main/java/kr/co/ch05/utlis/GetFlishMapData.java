package kr.co.ch05.utlis;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.servlet.support.RequestContextUtils;

import kr.co.ch05.vo.UserVO;

public class GetFlishMapData {
	
	public static UserVO flishMapData(HttpServletRequest req) {
		
		UserVO vo = null;
		
		// Redirect로 저장된 값들이 담겨진 map을 가져온다.
		Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(req);
		
		// 저장된 데이터가 있다면
		if(flashMap != null){
			System.out.println("start...");
			vo = (UserVO)flashMap.get("UserVO");
		}
		
		return vo;
	}
	

}
