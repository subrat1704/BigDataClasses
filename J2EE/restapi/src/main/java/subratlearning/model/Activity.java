package subratlearning.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Activity{
	
	private String description;
	private int duration;
	private String activityId;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public void setDescription(String desc)
	{
		this.description=desc;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDuration(int dur)
	{
		this.duration=dur;
	}
	public int getDuration()
	{
		return this.duration;
	}

}
