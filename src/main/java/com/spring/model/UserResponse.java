package com.spring.model;

import java.io.Serializable;

public class UserResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4469393343897436186L;

	private final String usertoken;

	public UserResponse(String usertoken) {
		this.usertoken = usertoken;
	}

	public String getToken() {
		return this.usertoken;
	}

}
