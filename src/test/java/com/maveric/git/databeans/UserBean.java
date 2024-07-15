package com.maveric.git.databeans;

public class UserBean {

	private String userName, passwsord;

	public UserBean() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswsord() {
		return passwsord;
	}

	public void setPasswsord(String passwsord) {
		this.passwsord = passwsord;
	}

	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", passwsord=" + passwsord + "]";
	}

}
