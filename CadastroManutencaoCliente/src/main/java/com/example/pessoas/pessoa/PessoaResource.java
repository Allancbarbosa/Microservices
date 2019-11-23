package com.example.pessoas.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public List<PessoaDtoSaida> listar() {
		return pessoaService.listar();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PessoaDtoSaida> buscar(@PathVariable Long id) {
		
		
		PessoaDtoSaida pessoaDtoSaida = pessoaService.buscar(id);
		if(pessoaDtoSaida == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pessoaDtoSaida);
		}

	}

	@PostMapping
	public PessoaDtoSaida adicionar(@RequestBody PessoaDtoEntrada pessoaDtoEntrada) {
		return pessoaService.adicionar(pessoaDtoEntrada);
	}

	@PutMapping("/{id}")
	public PessoaDtoSaida adicionar(@RequestBody PessoaDtoEntrada pessoaDtoEntrada, @PathVariable Long id) {
		return pessoaService.alterar(pessoaDtoEntrada, id);
	}

	@DeleteMapping("/{id}")
	public void excliur(@PathVariable Long id) {
		pessoaService.excluir(id);
	}

}
