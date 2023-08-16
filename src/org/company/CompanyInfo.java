package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Company name is Insoft Pvt Ltd");
	}
private void companyId() {
	System.out.println("Company Id is IN43844");
}
private void companyAddress() {
	System.out.println("Company Address Electronic city, Bangalore");
}

public static void main(String[] args) {
	CompanyInfo b = new CompanyInfo();
	
	b.companyName();
	b.companyId();
	b.companyAddress();
	
}

}
