package br.mp.mppa.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mp.mppa.domain.Entrada;
import br.mp.mppa.repository.EntradaRepository;

@RestController
@RequestMapping(
		produces="application/json;",
		path="/v1"
		)
public class Hello {
	
	@Autowired
	private EntradaRepository entradaRepository;
	
	@RequestMapping( path="/hello", method=GET )
	public ResponseEntity<String> hello(){
		return ResponseEntity.ok( "Hello from 1.5.14" );
	}
	
	@RequestMapping( path="/entrada", method=GET )
	public ResponseEntity<List<Entrada>> listEntrada(){
		return ResponseEntity.ok( entradaRepository.findAll() );
	}
}
