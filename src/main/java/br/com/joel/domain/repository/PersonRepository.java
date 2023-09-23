package br.com.joel.domain.repository;

import br.com.joel.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface PersonRepository extends JpaRepository<Person ,Long> {
}
