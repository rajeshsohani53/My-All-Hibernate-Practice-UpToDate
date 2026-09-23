package com.rajesh.main;

import java.time.LocalDate;

import com.rajesh.dao.EntityDao;
import com.rajesh.entity.VehicalRegistration;

public class Main {
  public static void main(String[] args) {
	VehicalRegistration v=new VehicalRegistration();
	v.setId(1); 
	v.setVehical_Color("Red");
	v.setVehical_DateOfPurchase(LocalDate.now());
	v.setVehical_Model("CLassic 350");
	v.setVehical_Type("bike");
	v.setVehical_NoOfPassangers("2");
	v.setVehical_RegistrationNo("8975382351");
	EntityDao dao=new EntityDao();
	//dao.updateVehicle(v);
	dao.deleteVehicleById(2);
}
}
