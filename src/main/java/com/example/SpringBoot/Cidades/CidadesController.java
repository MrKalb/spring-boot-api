package com.example.SpringBoot.Cidades;

import java.util.Optional;

import javax.tools.JavaFileObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
@CrossOrigin
@RequestMapping(path = "/Cidades")
public class CidadesController {

	@Autowired
	private CidadesProperty cidadeProperty;

//	Gravar as cidades	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String AddNewCidade(@RequestBody String payload) throws Exception {
		 JSONPObject my_obj = new JSONPObject(payload, payload);
		return payload;
		
	}

//	listar Todos os campos das cidades
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Cidades> getCidadesall() {
		System.out.println("buscando todas Cidades");
		return cidadeProperty.findAll();
	}

//	listar os campos das cidades por id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Cidades> findById(@PathVariable("id") int id) {
		System.out.println("buscando Cidades com id: "+ id);
		return cidadeProperty.findById(id);
	}

//	deletar os campos das cidades por id
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody String deleteById(@PathVariable("id") int id) {
		cidadeProperty.deleteById(id);
		return "deletado id = " + id;
	}
	
}
