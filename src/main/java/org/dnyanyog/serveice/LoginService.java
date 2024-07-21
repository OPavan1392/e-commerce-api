package org.dnyanyog.serveice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyantog.dto.Login;
import org.dnyanyog.common.DBUtils;

public class LoginService {

	public String login(Login loginBody) throws SQLException {

		String resultquery = "Select * from user where User_Fname ='" + loginBody.user + "'and User_Pass='"
				+ loginBody.password + "'";

		ResultSet resultSet = DBUtils.ExecuteSelectQuery(resultquery);
		if (resultSet.next()) {
			return "Login Succefully";
		} else {
			return "login faild";
		}

	}
}