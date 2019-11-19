package com.actuator.custom;

public class MyEndPointResponse {
	
	private Integer id;
	private String detail;
	private String status;
	
	public MyEndPointResponse(Integer id, String detail, String status) {
		super();
		this.id = id;
		this.detail = detail;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "MyEndPointResponse [id=" + id + ", detail=" + detail + ", status=" + status + "]";
	}
	
	

}
