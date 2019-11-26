package challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import challenge.models.Users;
import challenge.respository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository ur;
	
	public Users getUserByUsername(String username) {
		return ur.findByUsername(username);
	}
	
	public Users saveUser(Users user) {
		return ur.save(user);
	}
}
