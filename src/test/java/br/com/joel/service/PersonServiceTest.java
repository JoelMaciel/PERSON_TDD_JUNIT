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
import org.springframework.dao.DataIntegrityViolationException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {
    private Person person;
    private PersonDTO newPerson;

    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository personRepository;

    @BeforeEach
    void init() {
        person = new Person("Joel", "Maciel", "Caucaia-CE",
                "Masculino", "maciel@gmail");

        newPerson = personService.create(person);
    }

    @Test
    @DisplayName("When Create a Person with Success Shoud Return a Person")
    void testCreatePerson_WhenSucess_ShoulReturnPerson() {


        assertNotNull(newPerson);
    }

    @Test
    @DisplayName("When Create a Person with Success Should Return all attributes of Person")
    void testCreatePerson_WhenSuccess_ShouldContainsAllAttributesInReturnOfPerson() {


        assertNotNull(newPerson.getId());
        assertEquals(person.getFirsName(), newPerson.getFirsName());
        assertEquals(person.getLastName(), newPerson.getLastName());
        assertEquals(person.getAddress(), newPerson.getAddress());
        assertEquals(person.getGender(), newPerson.getGender());
        assertEquals(person.getEmail(), newPerson.getEmail());
    }

    @Test
    void testeCreateperson_WhitNullEmail_ShouldThrowIllegalArgumentException() {
        person.setEmail(null);

        assertThrows(DataIntegrityViolationException.class, () -> personService.create(person));
    }
}













