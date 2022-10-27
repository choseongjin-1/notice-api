package com.notice.api.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notice.api.util.ResponseUtil;

@Service
public class UserService {
	
	@Autowired
	ResponseUtil responseUtil;
	
	public Map<String, Object> getUser(String username, String password) throws Exception {
		if ("1".equals(username) && "1".equals(password)) {
			return responseUtil.resSuccess("로그인이 완료되었습니다.");
		}
		return responseUtil.resSuccess("로그인에 실패하였습니다.");
	}

}
