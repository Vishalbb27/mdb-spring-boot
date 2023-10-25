package com.project.mdbspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private byte[] storedSalt;
    private byte[] hashedPassword;

    public User() {
    }

    public User(int id, String name, String email, byte[] storedSalt, byte[] hashedPassword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.storedSalt = storedSalt;
        this.hashedPassword = hashedPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getStoredSalt() {
        return storedSalt;
    }

    public void setStoredSalt(byte[] storedSalt) {
        this.storedSalt = storedSalt;
    }

    public byte[] getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(byte[] hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
