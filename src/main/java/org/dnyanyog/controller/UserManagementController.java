package org.dnyanyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnyantog.dto.User;
import org.dnyanyog.serveice.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagementController {
	@Autowired
	UserManagementService userManagementService;
	
	@GetMapping("/getAllUser")
	
	public List<User> getAllUser() throws SQLException{
		return userManagementService.getAllUser();
	}
	

}
