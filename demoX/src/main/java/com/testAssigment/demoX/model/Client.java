package com.testAssigment.demoX.model;

import com.testAssigment.demoX.controller.ContactController;
import jakarta.persistence.*;

import java.util.Date;

@Table(name="client")
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    private Date contratDateStart;
    private String email;
    @ManyToOne
    @JoinColumn(name = "contact_id_contact")
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Client() {
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getContratDateStart() {
        return contratDateStart;
    }

    public void setContratDateStart(Date contratDateStart) {
        this.contratDateStart = contratDateStart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
