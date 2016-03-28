package com.eapp.web.controller.dto;

public class User {

	private String userId;
	private String userName;
	private Double money;
	private double stature;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public double getStature() {
		return stature;
	}
	public void setStature(double stature) {
		this.stature = stature;
	}
	
	@Override
	public String toString() {
		return "[ID:" + this.userId + "NAME:" + this.userName + "MONEY:" + this.money + "STATURE:" + this.stature + "]";
	}
}
