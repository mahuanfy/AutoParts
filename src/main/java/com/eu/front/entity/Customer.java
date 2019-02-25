package com.eu.front.entity;
public class Customer {
    private Integer id;
    private String customerName;
    private String customerSex;
    private String customerAge;
    private String customerEmail;
    private String customerPhone;
    private String customerCompany;
    public Customer() {
        super();
    }
    public Customer(Integer id,String customerName,String customerSex,String customerAge,String customerEmail,String customerPhone,String customerCompany) {
        super();
        this.id = id;
        this.customerName = customerName;
        this.customerSex = customerSex;
        this.customerAge = customerAge;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerCompany = customerCompany;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSex() {
        return this.customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerAge() {
        return this.customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerCompany() {
        return this.customerCompany;
    }

    public void setCustomerCompany(String customerCompany) {
        this.customerCompany = customerCompany;
    }

}
