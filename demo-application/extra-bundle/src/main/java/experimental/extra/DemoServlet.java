package experimental.extra;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

@Slf4j
@Component(service = Servlet.class, property = {"osgi.http.whiteboard.servlet.pattern=/extra/*", "osgi.http.whiteboard.servlet.asyncSupported=true"}, scope = ServiceScope.PROTOTYPE)
public class DemoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException
	{
		log.info("Initializing Servlet /extra");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.getWriter().append("Just works.");
	}
}
