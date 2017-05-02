package ntut.csie.restful;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ntut.csie.controller.connectOtherServiceController;
import ntut.csie.model.MessageModel;
import ntut.csie.restful.security.ServerSecurity;

import java.util.*;

@RestController
public class MessageRestful {
	protected connectOtherServiceController mcosc;
	
	@RequestMapping(value = "/PostNotificationMessage", method = RequestMethod.POST)
	@ResponseBody
	public boolean getMessage(@RequestBody String data){
		MessageModel mm = new MessageModel(data);
		if (!ServerSecurity.isEzscrumServer(mm.getVerification()))
			return false;
		List<String> AccountsId = mcosc.GetAccountsIdByProjectId(mm.getProjectId());
		return true;
	}
}
