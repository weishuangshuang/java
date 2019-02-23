package xdd.ben;

public class RegUser {
	
	public int userId;
	public String userName;
	public String password;
	public String gender;
	public String pwdproblem;
	public String pwdanswer;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPwdproblem() {
		return pwdproblem;
	}
	public void setPwdproblem(String pwdproblem) {
		this.pwdproblem = pwdproblem;
	}
	public String getPwdanswer() {
		return pwdanswer;
	}
	public void setPwdanswer(String pwdanswer) {
		this.pwdanswer = pwdanswer;
	}
	public RegUser(int userId, String userName, String password, String gender, String pwdproblem, String pwdanswer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.pwdproblem = pwdproblem;
		this.pwdanswer = pwdanswer;
	}
	public RegUser() {
		super();
	}
	@Override
	public String toString() {
		return "RegUser [userId=" + userId + ", userName=" + userName + ", password=" + password + ", gender=" + gender
				+ ", pwdproblem=" + pwdproblem + ", pwdanswer=" + pwdanswer + "]";
	}
	
	

}
