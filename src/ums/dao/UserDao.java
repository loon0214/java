package ums.dao;

import java.util.List;

import ums.domain.User;

public interface UserDao {
	List<User> getUsers();
	User getUser(int userNo);
	boolean addUser(String userName);
	boolean updateUser(User user);
	boolean delUser(int userNo);
}