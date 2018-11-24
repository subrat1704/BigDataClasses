package subratlearning.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User
{
	private String UserId;
	private String UserName;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
}