package ntut.csie.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Token {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	private Set<Subscriber> subscribers;
	
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
	
	@ManyToMany(mappedBy = "tokens")
	public Set<Subscriber> getSubscribers(){
		return subscribers;
	}
	
	public void setSubscriber(Set<Subscriber> subscribers){
		this.subscribers = subscribers;
	}
	
}
