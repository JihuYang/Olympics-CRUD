package com.crud.olympics.DTO;

/*올림픽 경기 일정을 저장하는 model*/
public class CategoryDTO {
	
	private int id;
	private String category;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
