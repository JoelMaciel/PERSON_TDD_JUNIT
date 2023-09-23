package br.com.joel.domain.dto;

import br.com.joel.domain.entity.Person;
import lombok.Builder;

@Builder
public class PersonDTO {

    private Long id;
    private String firsName;
    private String lastName;
    private String address;
    private String gender;
    private String email;

    public PersonDTO(Long id, String firsName, String lastName, String address, String gender, String email) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.email = email;
    }

    public static PersonDTO toDTO(Person person) {
        return PersonDTO.builder()
                .id(person.getId())
                .firsName(person.getFirsName())
                .lastName(person.getLastName())
                .address(person.getAddress())
                .gender(person.getGender())
                .email(person.getEmail())
                .build();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
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
