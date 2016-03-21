package tn.bettaieb.qr_med.presentation.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.bettaieb.qr_med.persistence.User;
import tn.bettaieb.qr_med.services.interfaces.UserServicesLocal;

@Path("/users")
@RequestScoped
public class UserResources {
	@Inject
	private UserServicesLocal userServicesLocal;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> doFindAllUsers() {
		return userServicesLocal.findAllUsers();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response doAddUser(User user) {
		Boolean b = userServicesLocal.addUser(user);
		if (b == false) {
			return Response.status(Status.BAD_REQUEST).build();
		} else {
			return Response.status(Status.OK).build();
		}

	}

}
