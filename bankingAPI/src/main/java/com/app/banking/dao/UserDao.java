package com.app.banking.dao;

import java.util.List;

import com.app.banking.exception.UserException;
import com.app.banking.model.Role;
import com.app.banking.model.User;

public interface UserDao {

	public int addUser(User user) throws UserException;

	// needs only the username to delete a record since its unique
	public int deleteUser(String username) throws UserException;

	public int updateUser(User user) throws UserException;

	// unique
	public User getUserByUserId(int userId) throws UserException;
	
	// unique
	public User getUserByUsername(String username) throws UserException;

	// composite key
	public User getUserByFullNameBirthday(String firstname, String lastname, String birthDay) throws UserException;

	// unique
	public User getUserByEmail(String email) throws UserException;

	public List<User> getAllUser() throws UserException;

	public List<User> getUsersByFirstName(String firstName) throws UserException;

	public List<User> getUsersByLastName(String lastName) throws UserException;

	public List<User> getUsersByRole(Role role) throws UserException;

}
