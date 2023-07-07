package mx.com.gm.dao;


import mx.com.gm.domain.Person;
import org.springframework.data.respository.CrudRepository;

public interface IPersonDao extends CrudRepository<Person,Long>{

}
