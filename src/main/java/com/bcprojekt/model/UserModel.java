package com.bcprojekt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "usermodel")
@Entity
public class UserModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	@Column
	private String usrName;
	@Column
	private String usrPasswd;
	@Column
	private String usrDesc;
	
	public UserModel(){}
	
	public UserModel(int usrId, String usrName, String usrPasswd, String usrDesc) {
		super();
		this.userid = usrId;
		this.usrName = usrName;
		this.usrPasswd = usrPasswd;
		this.usrDesc = usrDesc;
	}
	public int getUsrId() {
		return userid;
	}
	public void setUsrId(int usrId) {
		this.userid = usrId;
	}
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public String getUsrPasswd() {
		return usrPasswd;
	}
	public void setUsrPasswd(String usrPasswd) {
		this.usrPasswd = usrPasswd;
	}
	public String getUsrDesc() {
		return usrDesc;
	}
	public void setUsrDesc(String usrDesc) {
		this.usrDesc = usrDesc;
	}

	
}
