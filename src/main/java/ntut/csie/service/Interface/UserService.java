package ntut.csie.service.Interface;

import ntut.csie.model.Subscriber;

import java.util.List;

public interface UserService {
	Subscriber findUserByUsername(String username);
	
	List<Subscriber> getUserList();
	
	void delete(Long id);
	
	Subscriber save(Subscriber user);
	
	Subscriber findUserById(Long id);
	
}
