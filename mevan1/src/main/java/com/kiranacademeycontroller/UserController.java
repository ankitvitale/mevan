package com.kiranacademeycontroller;

import java.util.ArrayList;

import com.kiranacademeyDBUtility.UserDao;
import com.kiranacademeystudent.User;

public class UserController {

	public static ArrayList<User> fatchuser() throws Exception {
		// TODO Auto-generated method stub
		
	     ArrayList<User> aluser = UserDao.fatchUser();
		return aluser;
	
		
	}

	

}
