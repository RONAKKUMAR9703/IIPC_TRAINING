package com.Ronak;

public class Student2 {

		 private long mobileno;
		 private int age;
		 private int id ;
		 Student2(long mo,int age,int id){
		
			 this.mobileno=mo;
			 this.age=age;
			 this.id=id;
		 }
		 public long getmobile() {
			 return this.mobileno;
		 }
		 public int getage() {
			 return this.age;
		 }
		 public int getid() {
			 return this.id;
		 }
		 public void display()
		 {
			 System.out.println("the mobile no. is "+this.mobileno);
			 System.out.println("the age  is "+this.age);
			 System.out.println("the id is "+this.id);
		 }
}
