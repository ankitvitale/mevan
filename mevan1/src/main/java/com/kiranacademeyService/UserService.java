 package com.kiranacademeyService;

import java.util.ArrayList;

import com.kiranacademeyDBUtility.UserDao;
import com.kiranacademeystudent.User;

public class UserService {
	
static ArrayList <User> fetchEmp() throws Exception{
		
	    ArrayList<User> aluser =UserDao.fatchUser(); 
		return aluser;

}
}
