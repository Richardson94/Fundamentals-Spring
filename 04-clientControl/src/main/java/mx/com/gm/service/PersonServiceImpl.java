package mx.com.gm.service;

import mx.com.gm.dao.IPersonDao;
import mx.com.gm.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonaService{

    @Autowired
    private IPersonDao personDao;

    @Override
    public List<Person> listPersons() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    public Person findPerson(Person person) {
       return personDao.findById(person.getIdPerson());
    }
}
