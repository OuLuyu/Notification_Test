package ntut.csie.dao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriberDAO {
	private static SubscriberDAO sInstance = null;
	
	public static SubscriberDAO getInstance(){
		if(sInstance == null){
			sInstance = new SubscriberDAO();
		}
		return sInstance;
	}
	
	@RequestMapping(value="/subscribe", method=RequestMethod.POST)
	public long create(String subscriberJsonString){
		System.out.println("123");
		return 1;
	}
}
