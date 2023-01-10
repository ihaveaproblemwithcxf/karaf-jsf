package experimental.webservice.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/demo")
public interface IDemoWebservice
{
	@GET
	@Path("/")
	String executeDemo();
}
