package com.codigofacilito.movies.dao;

import org.springframework.data.repository.CrudRepository;

import com.codigofacilito.movies.entities.Actor;

public interface IActorRepository extends CrudRepository<Actor,Long>{

}
