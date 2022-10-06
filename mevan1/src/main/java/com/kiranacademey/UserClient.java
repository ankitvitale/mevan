package com.kiranacademey;

import java.util.ArrayList;

import com.kiranacademeycontroller.UserController;
import com.kiranacademeystudent.User;





public class UserClient {
	public static void main(String[] args) throws Exception {
	
	ArrayList<User> arrayList =	UserController.fatchuser();
	
			for (User user : arrayList) {
				
				System.out.println("Enter user id:-"+user.getId());
				System.out.println("Enter user name:-"+user.getName());
				System.out.println("Enter user city:-"+user.getCity());
				System.out.println("Enter user state:-"+user.getState());
				
			}
		
		
	}

}


