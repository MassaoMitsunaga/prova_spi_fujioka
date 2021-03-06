package br.com.massao.projeto_spi_avaliacao_01.service;

import br.com.massao.projeto_spi_avaliacao_01.domain.Person;
import br.com.massao.projeto_spi_avaliacao_01.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person findById(Long id){
        return personRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }


    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
