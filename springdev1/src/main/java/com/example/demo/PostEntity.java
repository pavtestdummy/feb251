package com.example.demo;

public class PostEntity {
	String id;
	String userId;
	String title;
	String body;
	public PostEntity() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public PostEntity(String id, String userId, String title, String body) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}
	@Override
	public String toString() {
		return "PostEntity [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + "]";
	}
	

}
