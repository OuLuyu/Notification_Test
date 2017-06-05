package ntut.csie.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.security.SecureRandom;

@Entity // This tells Hibernate to make a table out of this class
public class Token {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@NotBlank
	private String token;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getToken(){
		return token;
	}
	
	public void setToken(String token){
		this.token = token;
	}
	
}
