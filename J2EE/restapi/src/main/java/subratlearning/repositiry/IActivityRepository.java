package subratlearning.repositiry;

import java.util.List;

import subratlearning.model.Activity;

public interface IActivityRepository {

	List<Activity> GetAllActivities();
	Activity FindActivityById(String activityId);	
}