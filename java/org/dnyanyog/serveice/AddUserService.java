 	
package org.dnyanyog.serveice;

import java.sql.SQLException;

import org.dnyantog.dto.AddUserRequest;
import org.dnyantog.dto.AddUserResponse;
import org.dnyanyog.common.DBUtils;

public class AddUserService {
	
	public AddUserResponse addUser(AddUserRequest adduser) throws SQLException {
		AddUserResponse adduserrequest = new AddUserResponse();
		String resultAdduser = "INSERT into user (User_Fname, User_Lname, User_Gender, User_age,User_Email, User_pass, User_conpas)VALUES"
				+ "('"+ adduser.userFname+"','"+adduser.userLname+"','"+adduser.gender+"','"+adduser.age+"','"+adduser.userName+"','"+adduser.password+"','"+adduser.confirmPassword+"')";
		DBUtils.ExecuteQuery(resultAdduser);
		
		adduserrequest.errorCode = "0000" ;
		adduserrequest.message = "Added User";
		return adduserrequest;
		
		
	}
	
	

}
