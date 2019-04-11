package xdd.ben;

import java.sql.Date;

public class Blog {
	
	int blogId;
	String blogName;
	String nickName;
	String photo;
	String description ;
	String affiche;
	int userId;
	String accessCount;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAffiche() {
		return affiche;
	}
	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAccessCount() {
		return accessCount;
	}
	public void setAccessCount(String accessCount) {
		this.accessCount = accessCount;
	}
	
	
	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogName=" + blogName + ", nickName=" + nickName + ", photo=" + photo
				+ ", description=" + description + ", affiche=" + affiche + ", userId=" + userId + ", accessCount="
				+ accessCount + "]";
	}
	public Blog() {
		super();
	}
	
	public Blog(int blogId,String blogName,String nickName,String photo,String description,String affiche,
	int userId,String accessCount) {
		super();
		this.blogId = blogId;
		this.blogName = blogName;
		this.nickName = nickName;
		this.photo = photo;
		this.description = description;
		this.affiche = affiche;
		this.userId = userId;
		this.accessCount = accessCount;
	}
	

}
