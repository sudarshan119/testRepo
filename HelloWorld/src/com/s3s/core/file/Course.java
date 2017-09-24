package com.s3s.core.file;

import java.io.Serializable;

public class Course implements Serializable{
	private int CID;
	private String CName;
	private String Professor;
	
	public int getCID() {
		return CID;
	}
	public String getCName() {
		return CName;
	}
	public String getProfessor() {
		return Professor;
	}
	
	public Course (int cid, String cName, String professor){
		CID=cid;
		CName=cName;
		Professor=professor;
	}
}
