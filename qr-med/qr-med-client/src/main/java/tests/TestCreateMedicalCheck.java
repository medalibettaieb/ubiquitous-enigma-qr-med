package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.bettaieb.qr_med.services.interfaces.MedicalCheckServicesRemote;

public class TestCreateMedicalCheck {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		MedicalCheckServicesRemote medicalCheckServicesRemote = (MedicalCheckServicesRemote) context.lookup(
				"/qr-med-ear/qr-med-ejb/MedicalCheckServices!tn.bettaieb.qr_med.services.interfaces.MedicalCheckServicesRemote");

		System.out.println(medicalCheckServicesRemote.createMedicalChek("labess", 1, 3));

	}

}
