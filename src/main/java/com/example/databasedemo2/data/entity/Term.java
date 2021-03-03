package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
@Table(name="terms")
public class Term {
    @Id
    @Column(name="terms_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int termsId;
    @Column(name="terms_description")
    private String termsDescription;
    @Column(name="terms_due_days")
    private int termsDueDays;

    @OneToOne(mappedBy = "term")
    private Vendor vendor;

    public Term() {
    }

    public Term(String termsDescription, int termsDueDays) {
        this.termsDescription = termsDescription;
        this.termsDueDays = termsDueDays;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public int getTermsId() {
        return termsId;
    }

    public void setTermsId(int termsId) {
        this.termsId = termsId;
    }

    public String getTermsDescription() {
        return termsDescription;
    }

    public void setTermsDescription(String termsDescription) {
        this.termsDescription = termsDescription;
    }

    public int getTermsDueDays() {
        return termsDueDays;
    }

    public void setTermsDueDays(int termsDueDays) {
        this.termsDueDays = termsDueDays;
    }
}
