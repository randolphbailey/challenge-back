package challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.models.Users;
import challenge.service.UsersService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService us;
	
	@GetMapping("/getByUsername/{username}")
	public Users getByUsername(@PathVariable String username) {
		return us.getUserByUsername(username);
	}
	
	@PostMapping("/create")
	public Users create(@RequestBody Users user) {
		return us.saveUser(user);
	}
}
