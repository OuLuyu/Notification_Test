package ntut.csie.service.Interface;

import ntut.csie.model.User;

import java.util.List;

public interface UserService {
	User findUserByUsername(String username);
	
	List<User> getUserList();
	
	String delete(Long id);
	
	String save(User user);
	
	User findUserById(Long id);
}
