package com.crud.olympics.DTO;

/*올림픽 경기 선수를 저장하는 model*/
public class AtheleteDTO {
	
	private int id;
	private int countryId;
	private String athelete;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getAthelete() {
		return athelete;
	}
	public void setAthelete(String athelete) {
		this.athelete = athelete;
	}

}
