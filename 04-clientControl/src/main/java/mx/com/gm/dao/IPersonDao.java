package mx.com.gm.dao;


import mx.com.gm.domain.Person;
import org.springframework.data.respository.CrudRepository;

import java.util.List;

public interface IPersonDao extends CrudRepository<Person,Long>{

    List<Person> findAll();

    void save(Person person);

    void delete(Person person);

    Person findById(Long idPerson);
}
