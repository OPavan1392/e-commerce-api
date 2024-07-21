package org.dnyanyog.serveice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnyantog.dto.User;
import org.dnyanyog.common.DBUtils;
import org.springframework.stereotype.Component;

@Component
public class UserManagementService {
	
	public List<User>  getAllUser() throws SQLException
	{
		ArrayList<User> userList= new ArrayList<>();
		String query = "Select * from user";
		ResultSet result=DBUtils.ExecuteSelectQuery(query);
		
while(result.next()) {
			
			User user=new User();
			user.user_id=result.getInt("user_id");
			user.name=result.getString("User_fname");
			user.email=result.getString("User_Lname");
			user.age=result.getString("User_pass");
			user.username=result.getString("User_Email");
			user.password=result.getString("User_pass");
			
			userList.add(user);
		}

		return userList;

	}
}

