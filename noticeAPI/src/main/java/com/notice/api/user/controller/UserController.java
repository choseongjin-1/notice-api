package com.notice.api.user.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notice.api.user.service.UserService;

@RestController
@RequestMapping(value="/notice-api")
public class UserController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
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
	@RequestMapping(value = "/user/{username}/{password}", method=RequestMethod.GET)
	public Map<String, Object> getUser(@PathVariable String username, @PathVariable String password) throws Exception {
		return userService.getUser(username, password);
	}
	
	/**
	 * 회원가입
	 * @methodName : saveUser
	 * @author     : choseongjin
	 * @date       : 2022.11.01
	 * @return
	 */
	@RequestMapping(value = "/user", method=RequestMethod.POST)
	public Map<String, Object> saveUser(@RequestBody Map<String, Object> param) throws Exception {
		return userService.saveUser(param);
	}
}
