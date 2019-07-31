package com.purchaseOrders.model;

import java.util.Date;

public class Training {

  private String contactName;
  private String companyName;
  private String address;
  private String email;
  private String telephoneNo;
  private String mobileNo;
  private String website;
  private String courseName;
  private Date startDate;
  private Date endDate;
  private String location;
  private double hotelFee;
  private int delegates;
  private double unitCost;
  private double totalCost;
  private String creditCard;
  private String subAccount;
  private int delegatesPaid;

  public Training(String contactName, String companyName, String address, String email, String telephoneNo, String mobileNo,
                  String website, String courseName, Date startDate, Date endDate, String location, double hotelFee,
                  int delegates, double unitCost, double totalCost, String creditCard, String subAccount, int delegatesPaid) {
    this.contactName = contactName;
    this.companyName = companyName;
    this.address = address;
    this.email = email;
    this.telephoneNo = telephoneNo;
    this.mobileNo = mobileNo;
    this.website = website;
    this.courseName = courseName;
    this.startDate = startDate;
    this.endDate = endDate;
    this.location = location;
    this.hotelFee = hotelFee;
    this.delegates = delegates;
    this.unitCost = unitCost;
    this.totalCost = totalCost;
    this.creditCard = creditCard;
    this.subAccount = subAccount;
    this.delegatesPaid = delegatesPaid;
  }

  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelephoneNo() {
    return telephoneNo;
  }

  public void setTelephoneNo(String telephoneNo) {
    this.telephoneNo = telephoneNo;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public double getHotelFee() {
    return hotelFee;
  }

  public void setHotelFee(double hotelFee) {
    this.hotelFee = hotelFee;
  }

  public int getDelegates() {
    return delegates;
  }

  public void setDelegates(int delegates) {
    this.delegates = delegates;
  }

  public double getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(double unitCost) {
    this.unitCost = unitCost;
  }

  public double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(double totalCost) {
    this.totalCost = totalCost;
  }

  public String getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(String creditCard) {
    this.creditCard = creditCard;
  }

  public String getSubAccount() {
    return subAccount;
  }

  public void setSubAccount(String subAccount) {
    this.subAccount = subAccount;
  }

  public int getDelegatesPaid() {
    return delegatesPaid;
  }

  public void setDelegatesPaid(int delegatesPaid) {
    this.delegatesPaid = delegatesPaid;
  }
}
