package br.com.joel.domain.service;

import br.com.joel.domain.dto.PersonDTO;
import br.com.joel.domain.entity.Person;

public interface PersonService {
    PersonDTO create(Person person);
}
