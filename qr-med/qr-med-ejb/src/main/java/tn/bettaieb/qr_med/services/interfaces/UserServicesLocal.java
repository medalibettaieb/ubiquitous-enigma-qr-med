package tn.bettaieb.qr_med.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.bettaieb.qr_med.persistence.User;

@Local
public interface UserServicesLocal {
	Boolean addUser(User user);

	Boolean deleteUserById(Integer id);

	Boolean updateUser(User user);

	User findUserById(Integer id);

	List<User> findAllUsers();
}
