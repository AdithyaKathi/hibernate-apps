package com.mypack;

import javax.persistence.*;


@Entity
@Table(name="Exam500")
public class Exam {
	@Id
    private int examId;
	
	private String examName;
	private int maxMarks;
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	
	
}
