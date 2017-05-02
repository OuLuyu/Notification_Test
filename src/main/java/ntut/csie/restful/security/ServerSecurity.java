package ntut.csie.restful.security;


public class ServerSecurity {
	
	public static boolean isEzscrumSever(String base64Expression) {
		//"ZXpTY3J1bQ==" is the base64 expression of "ezScrum"
		if (base64Expression.equals("ZXpTY3J1bQ==") ) {
			return true;
		}
		return false;	

	} 

}
