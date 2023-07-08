package mx.com.gm.service;

import mx.com.gm.domain.Person;

import java.util.List;
public interface PersonaService {

    public List<Person> listPersons();

    public void save( Person person);

    public void delete( Person person);

    public Person findPerson ( Person person);

}
