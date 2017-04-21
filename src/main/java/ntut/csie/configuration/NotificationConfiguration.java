package ntut.csie.configuration;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.eclipse.jetty.server.nio.NetworkTrafficSelectChannelConnector;
import ntut.csie.service.core.ServiceConfiguration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ntut.csie")
public class NotificationConfiguration {
	ServiceConfiguration mconfig = new ServiceConfiguration();
	
	@Bean
	public DataSource dataSource(){
		
		
		DriverManagerDataSource  dataSource = new DriverManagerDataSource ();
		dataSource.setUsername(mconfig.getDBAccount());
		dataSource.setPassword(mconfig.getDBPassword());
		dataSource.setUrl(mconfig.getServerUrl() + ":" + mconfig.getServerPort());
		
		return dataSource;
	}
	
	@Bean
	public NetworkTrafficSelectChannelConnector conneter(){
		@SuppressWarnings("deprecation")
		NetworkTrafficSelectChannelConnector ntscc = new NetworkTrafficSelectChannelConnector();
		ntscc.setPort(mconfig.getServerPort());
		return ntscc;
	}
}
