package ntut.csie.service.core;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServiceConfigurationTest {
private ServiceConfiguration service;
	
	@Before
	public void setup() {
		service = new ServiceConfiguration();
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void testGetServerUrl() {
		String url = service.getServerUrl();
		assertEquals("127.0.0.1", url);
	}
	
	@Test
	public void testGetServerPort() {
		String port = service.getServerPort();
		assertEquals("9000", port);
	}
	
	@Test
	public void testGetWebServicePath() {
		String webServicePath = service.getWebServicePath();
		assertEquals(webServicePath, "/mantis/mc/mantisconnect.php");
		assertEquals("/mantis/mc/mantisconnect.php", webServicePath);
	}
	
	@Test
	public void testGetDBPort() {
		String port = service.getDBPort();
		assertEquals("3306", port);
	}
	
	@Test
	public void testGetDBAccount() {
		String account = service.getDBAccount();
		assertEquals("root", account);
	}
	
	@Test
	public void testGetDBPassword() {
		String password = service.getDBPassword();
		assertEquals("root", password);
	}
	
	@Test
	public void testGetDBType() {
		String DBType = service.getDBType();
		assertEquals("MySQL", DBType);
	}
	
	@Test
	public void testGetDBName() {
		String DBName = service.getDBName();
		assertEquals("ezScrum_Notification", DBName);
	}
	
	@Test
	public void testGetAccountManagementUrl() {
		String url = service.getAccountManagementUrl();
		assertEquals("127.0.0.1", url);
	}
	
	@Test
	public void testGetAccountManagementPort() {
		String port = service.getAccountManagementPort();
		assertEquals("8888", port);
	}

}
