package com.example.SpringBoot.Cidades;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadesProperty extends CrudRepository<Cidades, Integer> {
	
	@Override
    List<Cidades> findAll();

}
