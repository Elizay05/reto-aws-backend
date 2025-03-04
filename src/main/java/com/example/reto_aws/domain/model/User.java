package com.example.reto_aws.domain.model;

public class User {

    private String documentNumber;
    private String name;
    private String email;

    public User(String documentNumber, String name, String email) {
        this.documentNumber = documentNumber;
        this.name = name;
        this.email = email;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
