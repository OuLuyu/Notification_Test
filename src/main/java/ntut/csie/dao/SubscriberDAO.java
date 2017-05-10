package ntut.csie.dao;


public class SubscriberDAO {
	private static SubscriberDAO sInstance = null;
	
	public static SubscriberDAO getInstance(){
		if(sInstance == null){
			sInstance = new SubscriberDAO();
		}
		return sInstance;
	}	
}
