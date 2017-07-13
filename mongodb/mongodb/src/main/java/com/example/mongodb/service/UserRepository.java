/**
 * Project Name:mongodb
 * File Name:UserRepository.java
 * Package Name:com.example.mongodb.service
 * Date:2017年7月8日上午11:25:25
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mongodb.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.po.User;

/**
 * ClassName:UserRepository <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午11:25:25 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
public interface UserRepository extends MongoRepository<User, String> {

}
