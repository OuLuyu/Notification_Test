package ntut.csie.service.Interface;

import ntut.csie.model.Token;

public interface TokenService {
	Token getTokenById(Long Id);
	
	Token getTokenByTokenString(String tokenString);
	
	void delete(Long Id);
	
	Token create(Token token);
}
