package com.testAssigment.demoX.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name="contact")
@Entity
public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpportunity;

    //@ManyToMany(mappedBy = "opportunities")
    private List<
            //Contact
            String
            > contactList;

    public Opportunity() {
    }

    public int getIdOpportunity() {
        return idOpportunity;
    }

    public void setIdOpportunity(int idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public List<String> getContactList() {
        return contactList;
    }

    public void setContactList(List<String> contactList) {
        this.contactList = contactList;
    }

    /**
     *
     public List<Contact> getContactList() {
     return contactList;
     }

     public void setContactList(List<Contact> contactList) {
     this.contactList = contactList;
     }
     */
}
