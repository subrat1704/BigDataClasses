package subratlearning.client;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import subratlearning.model.Activity;

public class ActivityClient {
	private Client client;
	public ActivityClient()
	{
		client=ClientBuilder.newClient();
	}
	
	public Activity get(String id) {
		
		WebTarget target=client.target("http://localhost:8080/restapi/webapi/");
		Activity response=target.path("myactivity/"+id).request().get(Activity.class);
		
		return response;
	}

}
