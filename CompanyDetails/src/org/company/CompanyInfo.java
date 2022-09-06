package org.company;

public class CompanyInfo {

	public void CompanyName() {
		System.out.println("Company Name : Wipro");
	}

	public void CompanyID() {

		System.out.println("Company ID :12764 ");

	}

	public void CompanyAddress() {
		System.out.println("Company Address : Tambaram");

	}

	public static void main(String[] args) {

		CompanyInfo comp = new CompanyInfo();
		comp.CompanyName();
		comp.CompanyID();
		comp.CompanyAddress();
	}

}
