package com.example.SpringBoot.Cidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/Cidades")
public class ApiMapping {
	
	@Autowired
	private CidadesController cidadesController;
	
//	pegar todas as Cidades
	@GetMapping
    public List<Cidades> getCidades() {
		System.out.println("teste");
        return cidadesController.getCidades();
    }

//gravar as Cidades No Banco
	@PostMapping
	public Cidades addCidades(@RequestBody Cidades cidades) {
		return cidadesController.addCidades(cidades);
	}

}
