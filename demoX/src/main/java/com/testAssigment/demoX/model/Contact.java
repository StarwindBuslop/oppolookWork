package com.testAssigment.demoX.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Table(name="contact")
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContact;
    private String nameC;
    private String email;
    private String telephone;
    private Date datecall;
    @ManyToMany
    @JoinTable(
            name = "oppojoin",
            joinColumns = @JoinColumn(name = "id_contact"),
            inverseJoinColumns = @JoinColumn(name = "id_opportunity"))
    private List<Opportunity> opportunites;

    @ManyToMany
    @JoinTable(name = "contact_opportunities",
            joinColumns = @JoinColumn(name = "contact_idContact", referencedColumnName = "opportunities_idOpportunity"))
    private List<Opportunity> opportunities = new ArrayList<>();

    public List<Opportunity> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(List<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }

    public Contact() {

    }

    public int getIdContact() {
        return idContact;
    }
    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }
    public String getNameC() {
        return nameC;
    }
    public void setNameC(String nameC) {
        this.nameC = nameC;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Date getDatecall() {
        return datecall;
    }
    public void setDatecall(Date datecall) {
        this.datecall = datecall;
    }

    public List<Opportunity> getOpportunites() {
        return opportunites;
    }

    public void setOpportunites(List<Opportunity> opportunites) {
        this.opportunites = opportunites;
    }
}
