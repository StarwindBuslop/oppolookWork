package com.testAssigment.demoX.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name="contact")
@Entity
public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpportunity;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idContact")
    private List<Contact> contactList;

    public Opportunity() {
    }

    public int getIdOpportunity() {
        return idOpportunity;
    }

    public void setIdOpportunity(int idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
