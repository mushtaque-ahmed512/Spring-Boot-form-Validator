

package com.validate.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	@NotBlank( message = "User name can't be empty!! ")
	@Size(min = 3,max = 13 ,message = "User name must be betwen 3 - 12 character!!")
    private  String name;
	
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+$" , message = "Invalid email!!")
     private String email;

   @AssertTrue(message = "Agreed terms and conditions")
   private boolean agreed;
 
 public LoginData(String name, String email) {
	super();
	this.name = name;
	this.email = email;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public String getEmail() {
	return email;
 }

 public void setEmail(String email) {
	this.email = email;
 }

 public LoginData() {
	super();
	// TODO Auto-generated constructor stub
 }
 
 

 public boolean isAgreed() {
	return agreed;
}

 public void setAgreed(boolean agreed) {
	this.agreed = agreed;
 }

 @Override
 public String toString() {
	return "LoginData [name=" + name + ", email=" + email + "]";
 }
 
 
 

}
