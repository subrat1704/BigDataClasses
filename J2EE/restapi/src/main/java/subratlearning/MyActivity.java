package subratlearning;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import subratlearning.model.Activity;
import subratlearning.model.User;
import subratlearning.repositiry.*;

@Path("myactivity")
public class MyActivity {

	private IActivityRepository activRepos = new ActivityResourceStub();
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Activity> GetAllActivities()
	{
		return activRepos.GetAllActivities();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{activityId}")
	public Activity FindMyActivity(@PathParam("activityId") String activityId)
	{
		return activRepos.FindActivityById(activityId);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{activityId}/user")
	public User FindUser(@PathParam("activityId") String activityId)
	{
		return activRepos.FindActivityById(activityId).getUser();
	}
	
	@POST
	@Path("activity")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Activity CreateActivityParams(MultivaluedMap<String, String>formParams)
	{
		System.out.println(formParams.getFirst("description"));
		System.out.println(formParams.getFirst("duration"));
		
		Activity activity = new Activity();
		activity.setDescription(formParams.getFirst("description"));
		activity.setDuration(Integer.parseInt(formParams.getFirst("duration")));
		
		return activity;
	}
	@POST
	@Path("activity")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Activity CreateActivityJSON(Activity activity)
	{
		System.out.println(activity.getDescription());
		System.out.println(activity.getDuration());
		
				
		return activity;
	}
}
