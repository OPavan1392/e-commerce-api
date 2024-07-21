package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyantog.dto.Login;
import org.dnyanyog.serveice.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@PostMapping("/login")
	public String login(@RequestBody Login loginBody) throws SQLException {
		return new LoginService().login(loginBody);
	}

}
