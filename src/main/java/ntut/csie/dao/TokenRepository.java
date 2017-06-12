package ntut.csie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ntut.csie.model.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
	Token findTokenByToken(String token);
}
