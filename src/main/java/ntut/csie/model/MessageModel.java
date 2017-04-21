package ntut.csie.model;

import java.util.HashMap;
import java.util.Map;

import org.json.*;

public class MessageModel {
	private int projectId;
	private String messageTital;
	private String messageBody;
	private String fromService;
	private String jumpUrl;
	
	public MessageModel(String data){
		try{
			JSONObject j = new JSONObject(data);
			projectId = j.getInt("projectId");
			messageTital = j.getJSONObject("message").getString("tital");
			messageBody = j.getJSONObject("message").getString("body");
			fromService = j.getJSONObject("service").getString("name");
			jumpUrl = j.getJSONObject("service").getString("jumpUrl");
		}catch(JSONException e){
			
		}
	}
	
	public int getProjectId(){
		return projectId;
		}
	
	public JSONObject getMessage(){
		Map map = new HashMap();
		map.put("tital", messageTital);
		map.put("body", messageBody);
		return new JSONObject(map);
	}
	
	public String getJumpUrl(){
		return jumpUrl;
	}
	
	public String getFromServiceName(){
		return fromService;
	}
}
