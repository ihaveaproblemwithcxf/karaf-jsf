package experimental.webservice;

import experimental.webservice.api.IDemoWebservice;
import lombok.extern.slf4j.Slf4j;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Slf4j
@Component
public class DemoWebservice implements IDemoWebservice
{
	@Activate
	public void init()
	{
		log.info("Activating DemoWebservice");
	}

	@Override
	public String executeDemo()
	{
		log.info("Webservice Called");
		return "Just works.";
	}

}
