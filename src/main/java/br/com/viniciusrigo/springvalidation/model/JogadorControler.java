package br.com.viniciusrigo.springvalidation.model;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadorControler {

	private static final Logger log = LoggerFactory.getLogger(JogadorControler.class);
	
	List<Jogador> jogadores = Arrays.asList(new Jogador("jogador1",null, OrigemEnum.LIGA),
											   new Jogador("jogador2",null, OrigemEnum.VINGADORES),
											   new Jogador("jogador3",null, OrigemEnum.LIGA),
											   new Jogador("jogador4",null, OrigemEnum.VINGADORES));

	
	@GetMapping(value="jogadores")
	public List<Jogador> lista(@RequestParam(required=false) OrigemEnum origem){
		System.out.println("Origem: "+ origem.getDescricao());
		
		return jogadores;
	}
	
	
	@PostMapping(value="jogadores", produces = "application/json")
	public ResponseEntity jogadorForm(@Valid @RequestBody Jogador jogador){
		System.out.println("jogador: "+ jogador);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	


}
