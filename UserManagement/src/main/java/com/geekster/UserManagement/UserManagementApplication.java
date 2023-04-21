package com.geekster.UserManagement;

import com.geekster.UserManagement.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class UserManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserManagementApplication.class, args);

		ApplicationContext context = SpringApplication.run(UserManagementApplication.class, args);

		UserService userService = context.getBean(UserService.class);

		// Add some test users
		userService.addUser(new User(123, "Doe", "johndoe123", "123 Main St", "555-1234"));
		userService.addUser(new User(456, "Doe", "janedoe456", "456 Elm St", "555-5678"));

		// Get all users
		System.out.println("All Users:");
		for (User user : userService.getAllUsers()) {
			System.out.println(user);
		}
		System.out.println();

		// Get user by ID
		int userId = 1;
		System.out.println("User with ID " + userId + ":");
		User user = userService.getUserById(userId);
		if (user != null) {
			System.out.println(user);
		} else {
			System.out.println("User not found.");
		}
		System.out.println();

		// Update user info
		userId = 2;
		User updatedUser = new User(123, "Smith", "janesmith456", "123 Main St", "555-5678");
		userService.updateUserInfo(userId, updatedUser);
		System.out.println("Updated User:");
		System.out.println(userService.getUserById(userId));
		System.out.println();

		// Delete user
		userId = 1;
		userService.deleteUser(userId);
		System.out.println("All Users after deleting user with ID " + userId + ":");
		for (User u : userService.getAllUsers()) {
			System.out.println(u);
		}

		((ConfigurableApplicationContext) context).close();
	}

}
