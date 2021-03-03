package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
@Table(name="vendors")
public class Vendor {
    @Id
    @Column(name="vendor_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vendorId;
    @Column(name="vendor_name")
    private String vendorName;
    @Column(name="vendor_address")
    private String address1;
    @Column(name="vendor_city")
    private String vendorCity;
    @Column(name="vendor_phone")
    private String vendorPhone;
    @Column(name="vendor_contact_last_name")
    private String vendorContactLastName;
    @Column(name="vendor_contact_first_name")
    private String vendorContactFirstName;

    @OneToOne
    @JoinColumn(name = "id_default_term")
    private Term term;

    @OneToOne
    @JoinColumn(name = "id_default_account")
    private Account account;

    public Vendor() {
    }

    public Vendor(String vendorName, String address1, String vendorCity, String vendorPhone, String vendorContactLastName, String vendorContactFirstName) {
        this.vendorName = vendorName;
        this.address1 = address1;
        this.vendorCity = vendorCity;
        this.vendorPhone = vendorPhone;
        this.vendorContactLastName = vendorContactLastName;
        this.vendorContactFirstName = vendorContactFirstName;
    }

    public Vendor(String vendorName, String address1, String vendorCity, String vendorPhone, String vendorContactLastName, String vendorContactFirstName, Term term, Account account) {
        this.vendorName = vendorName;
        this.address1 = address1;
        this.vendorCity = vendorCity;
        this.vendorPhone = vendorPhone;
        this.vendorContactLastName = vendorContactLastName;
        this.vendorContactFirstName = vendorContactFirstName;
        this.term = term;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorContactLastName() {
        return vendorContactLastName;
    }

    public void setVendorContactLastName(String vendorContactLastName) {
        this.vendorContactLastName = vendorContactLastName;
    }

    public String getVendorContactFirstName() {
        return vendorContactFirstName;
    }

    public void setVendorContactFirstName(String vendorContactFirstName) {
        this.vendorContactFirstName = vendorContactFirstName;
    }

}
