package com.example.enterpriseindividuelllaboration.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, nullable = false)
    private String Street;

    @Column(length = 6, nullable = false)
    private int postalCode;

    @Column(length = 30, nullable = false)
    private String city;

    @JsonIgnoreProperties("address")
    @OneToMany(mappedBy = "address",
    cascade = CascadeType.PERSIST,
    orphanRemoval = true)
    private List<Member> members;

    public Address() {
    }

    public Address(String street, int postalCode, String city, List<Member> members) {
        Street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}