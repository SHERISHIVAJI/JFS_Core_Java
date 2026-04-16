package com.inheritance;

public class InsurancePolicy {
	private String name;
	private String policyType;
	private double policyAmount;
	private double approvedAmount;
	private String policyStatus;
	
	public InsurancePolicy(String name) {
		this.name = name;
		this.policyType = "Not Assigned";
		this.policyAmount = 0.0;
		this.approvedAmount = 0.0;
		this.policyStatus = "Pending";
		System.out.println("Policy record created successfully!");
	}
	
	public InsurancePolicy(String name, String policyType, double policyAmount) {
		this.name = name;
		this.policyType = policyType;
		if(policyAmount > 0)
			this.policyAmount = policyAmount;
		else {
			this.policyAmount = 0.0;
			System.out.println("Invalid policy amount. Default value 0.0 assigned.");
		}
		this.approvedAmount = 0.0;
		this.policyStatus = "Pending";
		System.out.println("Policy record created successfully!");
	}
	
	public InsurancePolicy(String name, String policyType, double policyAmount, double approvedAmount, String policyStatus) {
		this.name = name;
		this.policyType = policyType;
		if(policyAmount > 0)
			this.policyAmount = policyAmount;
		else {
			this.policyAmount = 0.0;
			System.out.println("Invalid policy amount. Default value 0.0 assigned.");
		}
		if(approvedAmount >= 0 && approvedAmount <= this.policyAmount)
			this.approvedAmount = approvedAmount;
		else {
			this.approvedAmount = 0.0;
			System.out.println("Invalid approved amount. Default value 0.0 assigned.");
		}
		this.policyStatus = policyStatus;
		System.out.println("Policy record created successfully!");
	}
	
	public void updateApprovedAmount(double approvedAmount) {
		if(approvedAmount >= 0 && approvedAmount <= policyAmount) {
			this.approvedAmount = approvedAmount;
			System.out.println("Approved amount updated successfully.");
		}
		else {
			System.out.println("Invalid approved amount! It must be between 0 and policy amount.");
		}
	}
	
	public void changePolicyStatus(String policyStatus) {
		if(policyStatus != null && !policyStatus.equals("")) {
			this.policyStatus = policyStatus;
			System.out.println("Policy Status updated successfully!");
		}
		else {
			System.out.println("Invalid policy status! Status cannot be empty.");
		}
	}
	
	public void viewPolicySummary() {
		System.out.println("********* POLICY SUMMARY **********");
		System.out.println("Customer Name : " + name);
		System.out.println("Policy Type : " + policyType);
		System.out.println("Policy Amount : " + policyAmount);
		System.out.println("Approved Amount : " + approvedAmount);
		System.out.println("Policy Status : " + policyStatus);
	}
}
