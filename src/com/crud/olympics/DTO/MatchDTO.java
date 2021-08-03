package com.crud.olympics.DTO;

import java.sql.Date;

/*올림픽 세부 종목을 저장하는 model*/
public class MatchDTO {
	
	private int id;
	private int sportId;
	private Date date;
	private int atheleteOne;
	private int atheleteTwo;
	private int resultId;
	private Date regdate;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSportId() {
		return sportId;
	}
	public void setSportId(int sportId) {
		this.sportId = sportId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCountryIdOne() {
		return atheleteOne;
	}
	public void setCountryIdOne(int atheleteOne) {
		this.atheleteOne = atheleteOne;
	}
	public int getCountryIdTwo() {
		return atheleteTwo;
	}
	public void setCountryIdTwo(int atheleteTwo) {
		this.atheleteTwo = atheleteTwo;
	}
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
