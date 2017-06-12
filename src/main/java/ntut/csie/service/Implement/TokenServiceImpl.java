package ntut.csie.service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ntut.csie.dao.TokenRepository;
import ntut.csie.model.Token;
import ntut.csie.service.Interface.TokenService;

@Service
public class TokenServiceImpl implements TokenService {
	@Autowired
	private TokenRepository tokenRepository;
	
	public Token getTokenByTokenString(String token){
		return tokenRepository.findTokenByToken(token);
	}

	public Token getTokenById(Long id) {
		return tokenRepository.findOne(id);
	}

	public void delete(Long id) {
		tokenRepository.delete(id);
	}

	public Token create(Token token) {
		Token tk = new Token();
		tk.setToken(token.getToken());
		
		return tokenRepository.save(tk);
	}
	
}
