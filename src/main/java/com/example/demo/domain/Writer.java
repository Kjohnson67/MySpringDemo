package com.example.demo.domain;

public class Writer {
    //initially, the file name Author is red.
    //it means that this file has not been added to github
    //then, let's manually add it
    //after doing so, the file name turns green, because it has been added
    //next, lets manually commit it
    //after commiting, the file names turns blue, which means the file has been committed

    private String firstname;
    private String lastname;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
