package com.codigofacilito.movies.dao;

import org.springframework.data.repository.CrudRepository;

import com.codigofacilito.movies.entities.Gender;

public interface IGenderRepository extends CrudRepository<Gender,Long>{

}
