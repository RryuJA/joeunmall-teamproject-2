package com.javateam.dummyProject.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 고객정보 VO(값 객체) 
 */
public class UserVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 고객번호 : ﻿0000000
	private String userIndex;
	
	// 아이디
	private String userId;
	
	// 이름
	private String userName;
	
	// 비밀번호
	private String userPw;
	
	// 가입일
	private Date userDate;
	
	// 이메일
	private String userEmail;
	
	// 생년월일
	private Date userBirth;
	
	// 성별
	private String userGender;
	
	// 일반전화
	private String userLandline;
	
	// 휴대전화
	private String userMobile;
	
	// 우편번호
	private String userPost;
	
	// 주소
	private String userAddress;
	
	// 상세주소
	private String userAddressDetail;

	public String getUserIndex() {
		return userIndex;
	}

	public void setUserIndex(String userIndex) {
		this.userIndex = userIndex;
	}

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

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserLandline() {
		return userLandline;
	}

	public void setUserLandline(String userLandline) {
		this.userLandline = userLandline;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserPost() {
		return userPost;
	}

	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAddressDetail() {
		return userAddressDetail;
	}

	public void setUserAddressDetail(String userAddressDetail) {
		this.userAddressDetail = userAddressDetail;
	}

	@Override
	public String toString() {
		return "UserVO [userIndex=" + userIndex + ", userId=" + userId + ", userName=" + userName + ", userPw=" + userPw
				+ ", userDate=" + userDate + ", userEmail=" + userEmail + ", userBirth=" + userBirth + ", userGender="
				+ userGender + ", userLandline=" + userLandline + ", userMobile=" + userMobile + ", userPost="
				+ userPost + ", userAddress=" + userAddress + ", userAddressDetail=" + userAddressDetail + "]";
	}
	
}
