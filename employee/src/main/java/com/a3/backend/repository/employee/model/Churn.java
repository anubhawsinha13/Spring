package com.a3.backend.repository.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Churn {
	
	@Id
	private String customerID;
	@Column(name = "gender", nullable = false)
	private String gender;
	@Column(name = "SeniorCitizen", nullable = false)
	private String 	SeniorCitizen;
	@Column(name = "Partner", nullable = false)
	private String 	Partner;
	@Column(name = "Dependents", nullable = false)
	private String 	Dependents;
	@Column(name = "tenure", nullable = false)
	private String 	tenure;
	@Column(name = "PhoneService", nullable = false)
	private String 	PhoneService;
	@Column(name = "MultipleLines", nullable = false)
	private String 	MultipleLines;
	@Column(name = "InternetService", nullable = false)
	private String 	InternetService;
	@Column(name = "OnlineSecurity", nullable = false)
	private String 	OnlineSecurity;
	@Column(name = "OnlineBackup", nullable = false)
	private String 	OnlineBackup;
	@Column(name = "DeviceProtection", nullable = false)
	private String 	DeviceProtection;
	@Column(name = "TechSupport", nullable = false)
	private String 	TechSupport;
	@Column(name = "StreamingTV", nullable = false)
	private String 	StreamingTV;
	@Column(name = "StreamingMovies", nullable = false)
	private String 	StreamingMovies;
	@Column(name = "Contract", nullable = false)
	private String 	Contract;
	@Column(name = "PaperlessBilling", nullable = false)
	private String 	PaperlessBilling;
	@Column(name = "PaymentMethod", nullable = false)
	private String 	PaymentMethod;
	@Column(name = "MonthlyCharges", nullable = false)
	private String 	MonthlyCharges;
	@Column(name = "TotalCharges", nullable = false)
	private String 	TotalCharges;
	@Column(name = "Churn", nullable = false)
	private String 	Churn;
	
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSeniorCitizen() {
		return SeniorCitizen;
	}
	public void setSeniorCitizen(String seniorCitizen) {
		SeniorCitizen = seniorCitizen;
	}
	public String getPartner() {
		return Partner;
	}
	public void setPartner(String partner) {
		Partner = partner;
	}
	public String getDependents() {
		return Dependents;
	}
	public void setDependents(String dependents) {
		Dependents = dependents;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getPhoneService() {
		return PhoneService;
	}
	public void setPhoneService(String phoneService) {
		PhoneService = phoneService;
	}
	public String getMultipleLines() {
		return MultipleLines;
	}
	public void setMultipleLines(String multipleLines) {
		MultipleLines = multipleLines;
	}
	public String getInternetService() {
		return InternetService;
	}
	public void setInternetService(String internetService) {
		InternetService = internetService;
	}
	public String getOnlineSecurity() {
		return OnlineSecurity;
	}
	public void setOnlineSecurity(String onlineSecurity) {
		OnlineSecurity = onlineSecurity;
	}
	public String getOnlineBackup() {
		return OnlineBackup;
	}
	public void setOnlineBackup(String onlineBackup) {
		OnlineBackup = onlineBackup;
	}
	public String getDeviceProtection() {
		return DeviceProtection;
	}
	public void setDeviceProtection(String deviceProtection) {
		DeviceProtection = deviceProtection;
	}
	public String getTechSupport() {
		return TechSupport;
	}
	public void setTechSupport(String techSupport) {
		TechSupport = techSupport;
	}
	public String getStreamingTV() {
		return StreamingTV;
	}
	public void setStreamingTV(String streamingTV) {
		StreamingTV = streamingTV;
	}
	public String getStreamingMovies() {
		return StreamingMovies;
	}
	public void setStreamingMovies(String streamingMovies) {
		StreamingMovies = streamingMovies;
	}
	public String getContract() {
		return Contract;
	}
	public void setContract(String contract) {
		Contract = contract;
	}
	public String getPaperlessBilling() {
		return PaperlessBilling;
	}
	public void setPaperlessBilling(String paperlessBilling) {
		PaperlessBilling = paperlessBilling;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	public String getMonthlyCharges() {
		return MonthlyCharges;
	}
	public void setMonthlyCharges(String monthlyCharges) {
		MonthlyCharges = monthlyCharges;
	}
	public String getTotalCharges() {
		return TotalCharges;
	}
	public void setTotalCharges(String totalCharges) {
		TotalCharges = totalCharges;
	}
	public String getChurn() {
		return Churn;
	}
	public void setChurn(String churn) {
		Churn = churn;
	}
	

}
