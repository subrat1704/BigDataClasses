package subratlearning.repositiry;

import java.util.ArrayList;
import java.util.List;

import subratlearning.model.Activity;
import subratlearning.model.User;

public class ActivityResourceStub implements IActivityRepository {
/* (non-Javadoc)
 * @see subratlearning.repositiry.IActivityRepository#GetAllActivities()
 */

public List<Activity> GetAllActivities()
{
	List<Activity> activities = new ArrayList<Activity>();
	
	Activity activity1=new Activity();
	activity1.setDescription("Cycling");
	activity1.setDuration(55);
	activities.add(activity1);
	
	Activity activity2=new Activity();
	activity2.setDescription("swimming");
	activity2.setDuration(20);
	activities.add(activity2);
	return activities;
}
public Activity FindActivityById(String activityId)
{
	Activity activity1=new Activity();
	activity1.setActivityId("1234");
	activity1.setDescription("Cardio");
	activity1.setDuration(10);
	
	User user =new User();
	user.setUserId("1234");
	user.setUserName("SubratP");
	activity1.setUser(user);
	return activity1;
}


}