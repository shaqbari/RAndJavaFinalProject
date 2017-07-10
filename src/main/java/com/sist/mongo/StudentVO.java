package com.sist.mongo;

/*
 *    kor math        avg
 * A  96  85     ===> kor : 75
 * B  85  90     ===> math : 70 
 * C
 * */
public class StudentVO {
	/*R책p495부분*/
	
	private int hakbun;
	private String name;
	private String subject; //전공
	private int kor;
	private int eng;
	private int math;
	private int history;
	private int phy;
	private int chem;
	private int total;
	private double avg;
	private double success;//성취율 //평균에 비해 얼마나 잘했나
	
	
	
	public double getSuccess() {
		return success;
	}
	public void setSuccess(double success) {
		this.success = success;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	
	
	
}
