package tn.bettaieb.qr_med.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.bettaieb.qr_med.persistence.User;

@Remote
public interface UserServicesRemote {
	Boolean addUser(User user);

	Boolean deleteUserById(Integer id);

	Boolean updateUser(User user);

	User findUserById(Integer id);

	List<User> findAllUsers();

}
