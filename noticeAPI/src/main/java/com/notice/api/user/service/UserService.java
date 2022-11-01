package com.notice.api.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.notice.api.util.ResponseUtil;

@Service
public class UserService {
	
	@Autowired
	ResponseUtil responseUtil;
	
	/**
	 * 유저 목록 조회
	 * @methodName : getUser
	 * @author     : choseongjin
	 * @date       : 2022.11.01
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getUser(String username, String password) throws Exception {
		if ("1".equals(username) && "1".equals(password)) {
			return responseUtil.resSuccess("로그인이 완료되었습니다.");
		}
		return responseUtil.resSuccess("로그인에 실패하였습니다.");
	}
	
	/**
	 * 회원가입
	 * @methodName : saveUser
	 * @author     : choseongjin
	 * @date       : 2022.11.01
	 * @return
	 */
	public Map<String, Object> saveUser(Map<String, Object> param) throws Exception {
		if (!ObjectUtils.isEmpty(param)) {
			return responseUtil.resSuccess("회원가입이 완료되었습니다.");
		}
		return responseUtil.resSuccess("회원가입에 실패하였습니다.");
	}

}
