package br.com.joel.service;

import br.com.joel.domain.dto.PersonDTO;
import br.com.joel.domain.entity.Person;
import br.com.joel.domain.repository.PersonRepository;
import br.com.joel.domain.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PersonServiceTest {
    private  Person person;

    @Autowired
    private  PersonService personService;
    @Autowired
    private  PersonRepository personRepository;

    @BeforeEach
    void init() {
        person = new Person("Joel", "Maciel", "Caucaia-CE",
                "Masculino", "maciel@gmail");
    }

    @Test
    @DisplayName("When Create a Person with Success Shoud Return a Person")
    void testCreatePerson_WhenSucess_ShoulReturnPerson() {
        PersonDTO newPerson = personService.create(person);

        assertNotNull(newPerson);
    }

    @Test
    @DisplayName("When Create a Person with Success Should Return all attributes of Person")
    void testCreatePerson_WhenSuccess_ShouldContainsAllAttributesInReturnOfPerson() {
        PersonDTO newPerson = personService.create(person);

        assertNotNull(newPerson.getId());
        assertEquals(person.getFirsName(), newPerson.getFirsName());
        assertEquals(person.getLastName(), newPerson.getLastName());
        assertEquals(person.getAddress(), newPerson.getAddress());
        assertEquals(person.getGender(), newPerson.getGender());
        assertEquals(person.getEmail(), newPerson.getEmail());
    }
}
