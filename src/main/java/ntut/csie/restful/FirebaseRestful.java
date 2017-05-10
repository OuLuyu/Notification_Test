package ntut.csie.restful;

import org.json.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ntut.csie.service.core.ServiceConfiguration;

@RestController
public class FirebaseRestful {
	protected ServiceConfiguration SCF;
	
	@RequestMapping(value = "/GetFirebase", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getMessage() throws JSONException{
		return SCF.getFCM();
	}

}
