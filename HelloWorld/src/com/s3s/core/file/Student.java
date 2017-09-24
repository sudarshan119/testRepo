package com.s3s.core.file;

import java.io.Serializable;

public class Student implements Serializable{
	private int SID;
	private String SName;
	transient int Score;
	private String Grade;
	
	public Student(int sid, String sName, int score, String grade){
		SID=sid;
		SName=sName;
		Score=score;
		Grade=grade;
		
		
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}
}
