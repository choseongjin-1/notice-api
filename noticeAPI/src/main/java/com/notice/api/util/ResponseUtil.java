package com.notice.api.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ResponseUtil {
	
	public Map<String, Object> resSuccess(Object data) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("resultCode", "200");
		resultMap.put("data", data);
		return resultMap;
	}
	
	public Map<String, Object> resFail(Object data) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("resultCode", "-1");
		resultMap.put("data", data);
		return resultMap;
	}
}
