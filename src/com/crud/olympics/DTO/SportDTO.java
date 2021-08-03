package com.crud.olympics.DTO;

/*올림픽 세부 종목을 저장하는 model*/
public class SportDTO {
	
	private int id;
	private int categoryId;
	private String sports;
	private int goldMedal;
	private int silverMedal;
	private int bronzeMedal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	public int getGoldMedal() {
		return goldMedal;
	}
	public void setGoldMedal(int goldMedal) {
		this.goldMedal = goldMedal;
	}
	public int getSilverMedal() {
		return silverMedal;
	}
	public void setSilverMedal(int silverMedal) {
		this.silverMedal = silverMedal;
	}
	public int getBronzeMedal() {
		return bronzeMedal;
	}
	public void setBronzeMedal(int bronzeMedal) {
		this.bronzeMedal = bronzeMedal;
	}

}
