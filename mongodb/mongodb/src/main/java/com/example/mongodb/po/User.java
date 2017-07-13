/**
 * Project Name:mongodb
 * File Name:User.java
 * Package Name:com.example.mongodb.po
 * Date:2017年7月8日上午11:23:28
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mongodb.po;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午11:23:28 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */

@Setter
@Getter
@Document(collection = "ccp_sms_user_test")
public class User {

	private String id;
	private String info;

	@Indexed(expireAfterSeconds = 2)
	private Date createtime;

}
