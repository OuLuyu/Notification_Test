package ntut.csie.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.security.SecureRandom;

@Entity // This tells Hibernate to make a table out of this class
public class TokenRelation {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@NotBlank
	private Long tokenId;
	private Long userId;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public Long getTokenId(){
		return tokenId;
	}
	
	public void setTokenId(Long tokenId){
		this.tokenId = tokenId;
	}
	
	public Long getUserId(){
		return userId;
	}
	
	public void setUserId(Long userId){
		this.userId = userId;
	}
}
