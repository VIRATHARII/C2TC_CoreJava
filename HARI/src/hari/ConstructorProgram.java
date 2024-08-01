package hari;

import java.util.Scanner;

public class ConstructorProgram {

	public static void main(String[] args) {
		
		class customer {
		private String customerName;
		private int customerId;
		private String customerCity;
		// Default Constructor
		public void Customer() {
		System.out.println("Default");
		}
		//Parameterized Constructor
		//use of this keyword
		public void Customer(String customerName, int
		customerId, String customerCity) {
		
		System.out.println("Parameterized");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
		}
		//Getter and Setters
		public String getCustomerName() {
		return customerName;
		}
		public void setCustomerName(String
		customerName) {
		this.customerName = customerName;
		}
		public int getCustomerId() {
		return customerId;
		}
		public void setCustomerId(int customerId) {
		this.customerId = customerId;
		}
		public String getCustomerCity() {
		return customerCity;
		}
		public void setCustomerCity(String
		customerCity) {
		this.customerCity = customerCity;
		}
	
		public String toString() {
		return "Customer [customerName="+
		customerName + ", customerId=" + customerId + "";
		}
		}
		class ConstructorDemo {
		public void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		System.out.println("");
		}
		}
	}
}