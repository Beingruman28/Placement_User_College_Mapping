package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.entities.User;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IUserService;
//import com.cg.placement.service.IUserService;
//import com.cg.placement.service.UserServiceImpl;
import com.cg.placement.service.UserServiceImpl;

public class Client1
{
	public static void main(String[] args) 
	{
		// CRUD operation calling activity
		// CRUD operation calling activity
				User user = new User();
				College college = new College();
						IUserService service = new UserServiceImpl();
						ICollegeService service1 = new CollegeServiceImpl();
				
						
											// Create
						user.setId(101);
						user.setName("ruman");
						user.setType("admin");
						user.setPassword("ruman1234");
						user.setCollege(college);
						college.setId(201);
						college.setCollegeName("gce");
						//college.setCollegeAdmin(user);
						college.setLocation("rmg");
						college.setUser(user);
						service.addUser(user);
						service1.addCollege(college);
						
																	
					System.out.println("Row added");

				/*		
		
		// Update
		user	= service.updateUser(user);
		user.setId(100);
		user.setName("rohit");
		user.setPassword("rohit20");
		user.setType("admin");
		service.updateUser(user);
		System.out.println("Update is successful");
	
	*/
				
		
		
	}
}