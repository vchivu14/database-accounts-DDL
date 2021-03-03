package com.example.databasedemo2.data.entity;

import javax.persistence.*;

@Entity
@Table(name="invoices")
public class Invoice {
    @Id
    @Column(name="invoice_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceId;

    @Column(name="invoice_number")
    private String invoiceNumber;
    @Column(name="invoice_date")
    private String invoiceDate;
    @Column(name="invoice_total")
    private float invoiceTotal;
    @Column(name="payment_total")
    private float paymentTotal;
    @Column(name="credit_total")
    private float creditTotal;
    @Column(name="invoice_due_date")
    private String invoiceDueDate;
    @Column(name="payment_date")
    private String paymentDate;

    @OneToOne
    @JoinColumn
    private Term term;

    @ManyToOne
    @JoinColumn
    private Vendor vendor;

    public Invoice() {
    }

    public Invoice(String invoiceNumber, String invoiceDate, float invoiceTotal, float paymentTotal, float creditTotal, String invoiceDueDate, String paymentDate, Term term, Vendor vendor) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.invoiceTotal = invoiceTotal;
        this.paymentTotal = paymentTotal;
        this.creditTotal = creditTotal;
        this.invoiceDueDate = invoiceDueDate;
        this.paymentDate = paymentDate;
        this.term = term;
        this.vendor = vendor;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(float invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public float getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(float paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public float getCreditTotal() {
        return creditTotal;
    }

    public void setCreditTotal(float creditTotal) {
        this.creditTotal = creditTotal;
    }

    public String getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(String invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
