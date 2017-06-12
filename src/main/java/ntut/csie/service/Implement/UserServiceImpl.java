package ntut.csie.service.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ntut.csie.dao.UserRepository;
import ntut.csie.model.Subscriber;
import ntut.csie.service.Interface.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public Subscriber findUserByUsername(String username){
		return userRepository.findByUsername(username);
	}
	
	public List<Subscriber> getUserList(){
		return userRepository.findAll();
	}
	
	public void delete(Long id) {
		userRepository.delete(id);
	}
	
	public Subscriber save(Subscriber user){
		Subscriber us = new Subscriber();
        us.setUsername(user.getUsername());

        return userRepository.save(us);
	}
	
	public Subscriber findUserById(Long id){
		return userRepository.findOne(id);
	}
}
