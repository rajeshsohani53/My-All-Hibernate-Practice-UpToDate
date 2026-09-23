package com.rajesh.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;


@Entity
public class VehicalRegistration {
	
	public void setId(Integer id) {
		this.id = id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Pattern(
			regexp = "bike|car",
			message = "Type must be car or bike"
			)
    private String vehical_Type;
    private String vehical_Model;
    private String vehical_Color;
    
    
    @Min(value = 1,message = "At Least One Passenger Seat Needed")
    @Max(value = 7,message = "More than 7 passanger not allowed ")
    private String vehical_NoOfPassangers;
    private LocalDate vehical_DateOfPurchase;
    private String vehical_RegistrationNo;
	public VehicalRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getVehical_Type() {
		return vehical_Type;
	}
	public void setVehical_Type(String vehical_Type) {
		this.vehical_Type = vehical_Type;
	}
	public String getVehical_Model() {
		return vehical_Model;
	}
	public void setVehical_Model(String vehical_Model) {
		this.vehical_Model = vehical_Model;
	}
	public String getVehical_Color() {
		return vehical_Color;
	}
	public void setVehical_Color(String vehical_Color) {
		this.vehical_Color = vehical_Color;
	}
	public String getVehical_NoOfPassangers() {
		return vehical_NoOfPassangers;
	}
	public void setVehical_NoOfPassangers(String vehical_NoOfPassangers) {
		this.vehical_NoOfPassangers = vehical_NoOfPassangers;
	}
	public LocalDate getVehical_DateOfPurchase() {
		return vehical_DateOfPurchase;
	}
	public void setVehical_DateOfPurchase(LocalDate vehical_DateOfPurchase) {
		this.vehical_DateOfPurchase = vehical_DateOfPurchase;
	}
	public String getVehical_RegistrationNo() {
		return vehical_RegistrationNo;
	}
	public void setVehical_RegistrationNo(String vehical_RegistrationNo) {
		this.vehical_RegistrationNo = vehical_RegistrationNo;
	}
	public Integer getId() {
		return id;
	}
    
    
    
    
}
