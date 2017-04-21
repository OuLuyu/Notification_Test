package ntut.csie.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import ntut.csie.service.core.ServiceConfiguration;

public class AccountService {
	private List<String> accounts;
	private ServiceConfiguration mconfig;
	
	public boolean GetAccountsByProjectId(int projectId){
		try{
			URL url = new URL("http://" + mconfig.getAccountManagementUrl() +
					":" + mconfig.getAccountManagementPort() + "/GetAccountsByProjectId/" +projectId);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
			String list = "";
			String output;
			while ((output = br.readLine()) != null) {
				list += output;
			}
			accounts = Arrays.asList(list.split("\\s*,\\s*"));			
			
			return true;
		}catch(MalformedURLException e){
			e.printStackTrace();	
			return false;
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
		
	}
	
	public List<String> GetAccounts()
	{
		return accounts;
	}
}
