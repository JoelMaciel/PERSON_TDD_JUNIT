package br.com.joel.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String address;
    @Column
    private String gender;
    @Column
    private String email;

    public Person() {

    }


    public Person(Long id, String firsName, String lastName, String address, String gender, String email) {
        this.id = id;
        this.firstName = firsName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public Person(String firsName, String lastName, String address, String gender, String email) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
