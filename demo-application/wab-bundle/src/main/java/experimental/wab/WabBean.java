package experimental.wab;

import jakarta.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@RequestScoped
@ManagedBean(name = "wabBean")
public class WabBean
{
	private String text = "This is Text";

	@PostConstruct
	public void init()
	{
		log.info("WabBean is here");
	}
}
