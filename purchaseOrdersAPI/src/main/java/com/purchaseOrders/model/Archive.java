package com.purchaseOrders.model;

import java.util.Date;

public class Archive {
    private int pNo;
    private FormType formType;
    private ArchiveStatus status;
    private String desc;
    private AccountType subAccount;
    private Date date;
    private PurchaseOrder details;
    private Training details2;


    public PurchaseOrder getDetails() {
        return details;
    }

    public void setDetails(PurchaseOrder details) {
        this.details = details;
    }
//TODO will need another private for details which will be based on the component formTypE
    public Training getDetails2() {
        return details2;
}

    public void setDetails2(Training details2) {
        this.details2 = details2;
    }
    public int getpNo() {
        return pNo;
    }

    public void setpNo(int pNo) {
        this.pNo = pNo;
    }

    public FormType getFormType() {
        return formType;
    }

    public void setFormType(FormType formType) {
        this.formType = formType;
    }

    public ArchiveStatus getStatus() {
        return status;
    }

    public void setStatus(ArchiveStatus status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AccountType getSubAccount() {
        return subAccount;
    }

    public void setSubAccount(AccountType subAccount) {
        this.subAccount = subAccount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Archive(int pNo, FormType formType, AccountType subAccount, String desc, Date date, ArchiveStatus status, PurchaseOrder details, Training details2) {
        this.pNo = pNo;
        this.formType = formType;
        this.status = status;
        this.desc = desc;
        this.subAccount = subAccount;
        this.date = date;
        this.details = details;
        this.details2 = details2;
    }
}
