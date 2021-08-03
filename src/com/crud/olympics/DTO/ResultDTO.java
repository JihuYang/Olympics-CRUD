package com.crud.olympics.DTO;

import java.sql.Date;

/*올림픽 경기 결과를 저장하는 model*/
public class ResultDTO {
	
	private int id;
	private int atheleteIdWinner;
	private int atheleteIdLoser;
	private Date regdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAtheleteIdWinner() {
		return atheleteIdWinner;
	}
	public void setAtheleteIdWinner(int atheleteIdWinner) {
		this.atheleteIdWinner = atheleteIdWinner;
	}
	public int getAtheleteIdLoser() {
		return atheleteIdLoser;
	}
	public void setAtheleteIdLoser(int atheleteIdLoser) {
		this.atheleteIdLoser = atheleteIdLoser;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


}
