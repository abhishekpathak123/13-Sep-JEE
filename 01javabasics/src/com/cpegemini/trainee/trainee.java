 //step 1: One package declaration
package com.cpegemini.trainee;

import com.capgemini.date.MyDate;

//step 2: none or many import statements
/**
 * @author apathak8
 *
 */
//step 3 :public class
public class trainee {
     //step 4: private instance variables
	 //step 5: getters & setters in order to access private data outside the class
   private int traineeId;
   private String firstName;
   private String lastName;
   private long phoneNo;
   private String email;
   private MyDate dob;
   //has -a relationship/containment
   //object of other class as member of our class
   //step 6: static member variable
  private static String coName;
  //single copy per class 
  private static int numId;
  //for auto-generating ID
 //step 7:static block
  //used to initialize only static variable
  //invoke before constructor 
//static initializer block-will be executed only 
  static{
	  System.out.println("static block invoked");
	  numId=1000+(int)(Math.random()*123.123);
	  coName="Capgemini India Pvt. Ltd.";
	  //auto genrated id;
  }
  {
	  System.out.println("init block invoked");

}
  public trainee() {
	// TODO Auto-generated constructor stub
}
  @Override
public String toString() {
	return "trainee [traineeId=" + traineeId + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", email="
			+ email + ", dob=" + dob + "]";
}
public trainee( String firstName,String lastName,long phoneNo,String email, MyDate dob) {
  System.out.println("Overloaded constructor of Trainee");
  //remove trainee id
  this.firstName = firstName;
  this.lastName = lastName;
  this.phoneNo = phoneNo;
  this.email = email;
  this.dob = dob;
  
  }

}
