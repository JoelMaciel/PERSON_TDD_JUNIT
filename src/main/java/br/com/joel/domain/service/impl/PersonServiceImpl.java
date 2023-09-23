package br.com.joel.domain.service.impl;

import br.com.joel.domain.dto.PersonDTO;
import br.com.joel.domain.entity.Person;
import br.com.joel.domain.repository.PersonRepository;
import br.com.joel.domain.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Transactional
    @Override
    public PersonDTO create(Person person) {
        Person newPerson = personRepository.save(person);
        return PersonDTO.toDTO(newPerson);
    }
}
