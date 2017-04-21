package ntut.csie.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class NotificationInitializer implements WebApplicationInitializer{
	public void onStartup(ServletContext container) throws ServletException {
		
	}
}
