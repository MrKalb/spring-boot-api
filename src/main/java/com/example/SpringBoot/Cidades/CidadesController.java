package com.example.SpringBoot.Cidades;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CidadesController {

	@Autowired
	private CidadesProperty cidadeProperty;

	public List<Cidades> getCidades() {
		return cidadeProperty.findAll();
	}
	
    public Cidades addCidades(Cidades cidades) {
        return cidadeProperty.save(cidades);
    }
    
    public Cidades getCidadeById(int cidadeUpdateId) {
    	Optional<Cidades> cidadeId = cidadeProperty.findById(cidadeUpdateId);
		return cidadeId.get();
    	
    }
    
    public void DeleteById(int idCidade) {
    	cidadeProperty.deleteById(idCidade);
	}
	

}
