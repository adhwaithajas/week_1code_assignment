package com.prodapt.siamount;

public class SITotalAmount {
	static double interestRate = 12.78;
	static double principleBalance = 578984.78;
	static int time = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double finalAmount;
		finalAmount = principleBalance*(1+(interestRate*time));
		System.out.println("The Final Amount was " + finalAmount);
}
}
