package com.lti.demo;

public class Customer {
	
	private int custNo;
	private String custName;
	private double billAmount;
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", billAmount=" + billAmount + "]";
	}
	
	public Customer(int custNo, String custName, double billAmount) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.billAmount = billAmount;
	}
	
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public Customer()
	{
		super();
	}
	//4 getter setter , constructor ,default constructor //toString

}
