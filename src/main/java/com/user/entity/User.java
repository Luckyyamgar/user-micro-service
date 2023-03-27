package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long userId;
	private String name;
	private String phone;
	List<Contact> contact = new ArrayList<>();

	public User(Long userId, String name, String phone, List<Contact> contact) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}

	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User() {
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the contact
	 */
	public List<Contact> getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

}
