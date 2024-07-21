package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyantog.dto.AddUserRequest;
import org.dnyantog.dto.AddUserResponse;
import org.dnyanyog.serveice.AddUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	
	@PostMapping("/AddUser")
	public AddUserResponse adduser(@RequestBody AddUserRequest adduser) throws SQLException
	{
		return new AddUserService().addUser(adduser);
				
				
	}

}
