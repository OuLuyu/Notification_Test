package ntut.csie.service.Interface;

import ntut.csie.model.Token;

public interface TokenService {
	Token getTokenById(Long Id);
	
	Token getTokenByTokenString(String tokenString);
	
	String delete(Long Id);
	
	String create(Token token);
}
