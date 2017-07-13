/**
 * Project Name:mongodb
 * File Name:MongoDBController.java
 * Package Name:com.example.mongodb.controller
 * Date:2017年7月8日上午11:10:16
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mongodb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.po.User;
import com.example.mongodb.service.UserRepository;

/**
 * ClassName:MongoDBController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午11:10:16 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
@RestController
@RequestMapping("/mongodb/")
public class MongoDBController {

	@RequestMapping("index")
	@ResponseBody
	String index() {
		return "hello";
	}

	@Resource
	UserRepository userRepository;

	@RequestMapping("add")
	@ResponseBody
	String addUser() {
		Long b = System.currentTimeMillis();

		List<User> userList = new ArrayList<User>();
		for (int i = 1; i < 10000; i++) {
			User user = new User();
			user.setId(UUID.randomUUID().toString());
			user.setInfo(UUID.randomUUID().toString());
			user.setCreatetime(new Date());
			userList.add(user);
			if (i % 1000 == 0) {
				// userRepository.save(userList);
				userRepository.insert(userList);
				userList.clear();
			}
		}
		Long e = System.currentTimeMillis();
		return (e - b) + "ms";
	}

}
