package ntut.csie.service.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ServiceConfiguration {
	private Properties properties;
	private String BASEDIR_PATH = getBaseDirpath();
	private final String PERFS_FILE_NAME = "ezScrum_notification.ini";
	private final String PERFS_FILE_PATH = BASEDIR_PATH + File.separator + PERFS_FILE_NAME;
	private final String SERVER_URL = "ServerUrl";
	private final String SERVER_PORT = "ServerPort";
	private final String SERVICE_PATH = "ServicePath";
	private final String DATABASE_Port = "DatabasePort";
	private final String ACCOUNT = "Account";
	private final String PASSWORD = "Password";
	private final String DATABASE_TYPE = "DatabaseType";
	private final String DATABASE_NAME = "DatabaseName";
	private final String ACCOUNTMANAGEMENT_URL = "AccountManagementServiceURL";
	private final String ACCOUNTMANAGEMENT_PORT = "AccountManagementServicePort";
	
	public ServiceConfiguration(){
		init();
	}
	
	private void init() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(PERFS_FILE_PATH));
		} catch (IOException e) {
			System.out.println(
					"************ ERROR MESSAGE ************\n\n\n" +
					"Please check \"ezScrum_notification.ini\" file exist.\n\n\n" +
					"***************************************\n\n\n"
			);
			System.exit(0);
		}
	}

	public String getBaseDirpath(){
		String basedir = System.getProperty("ntut.csie");
		if (basedir == null) {
			basedir = System.getProperty("user.dir");
		}
		return basedir;
	}
	
	public String getServerUrl() {
		return properties.getProperty(SERVER_URL);
	}
	
	public int getServerPort() {
		return Integer.valueOf(properties.getProperty(SERVER_PORT));
	}
		
	public String getWebServicePath() {
		return properties.getProperty(SERVICE_PATH);
	}
	
	public String getDBPort(){
		return properties.getProperty(DATABASE_Port);
	}
	
	public String getDBAccount(){
		return properties.getProperty(ACCOUNT);
	}
	
	public String getDBPassword(){
		return properties.getProperty(PASSWORD);
	}
	
	public String getDBType() {
		return properties.getProperty(DATABASE_TYPE);
	}
	
	public String getDBName() {
		return properties.getProperty(DATABASE_NAME);
	}
	
	public String getAccountManagementUrl() {
		return properties.getProperty(ACCOUNTMANAGEMENT_URL);
	}
	
	public String getAccountManagementPort() {
		return properties.getProperty(ACCOUNTMANAGEMENT_PORT);
	}
}
