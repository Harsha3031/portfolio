package com.me;

public class Myprojectuser {
	private String Name;
	private String Email;
	private String Sub;
	private String Msg;
	
	public Myprojectuser(String name, String email, String sub, String msg) {
		Name = name;
		Email = email;
		Sub = sub;
		Msg = msg;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getSub() {
		return Sub;
	}



	public void setSub(String sub) {
		Sub = sub;
	}



	public String getMsg() {
		return Msg;
	}



	public void setMsg(String msg) {
		Msg = msg;
	}



	@Override
	public String toString() {
		return "Myprojectuser [Name=" + Name + ", Email=" + Email + ", Sub=" + Sub + ", Msg=" + Msg + "]";
	}
	
	

}



