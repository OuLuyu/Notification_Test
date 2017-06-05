package ntut.csie.service.Implement;

import ntut.csie.model.User;
import ntut.csie.service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
	
	@Override
	public User findUserByUsername(String username){
		
	}
	
	@Override
	public List<User> getUserList(){
		
	}
	
	@Override
	public String delete(Long id){
		
	}
	
	@Override
	public String save(User user){
		
	}
	
	@Override
	public User findUserById(Long id){
		
	}
}
