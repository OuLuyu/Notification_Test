package ntut.csie.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Subscriber {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	private Set<Token> tokens;
	
	@NotBlank
	private String username;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "token_relation", joinColumns = @JoinColumn(name = "subscriber_id", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "token_id", referencedColumnName = "id"))
	public Set<Token> getTokens() {
        return tokens;
    }

	public void setTokens(Set<Token> tokens) {
        this.tokens = tokens;
    }
	
}