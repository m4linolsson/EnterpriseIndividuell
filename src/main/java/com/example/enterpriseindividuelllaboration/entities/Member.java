package com.example.enterpriseindividuelllaboration.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(length = 20, nullable = false)
    private String firstName;


    @Column(length = 30, nullable = false)
    private String lastName;

    @JsonIgnoreProperties("members")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Address address;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(length = 15)
    private long phone;

    @Column(length = 8, nullable = false)
    private int dateOfBirth;

    public Member() {
    }

    public Member(String firstName, String lastName, Address address, String email, long phone, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
